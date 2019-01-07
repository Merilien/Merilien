package com.greenfox.myreddit.controller;

import com.greenfox.myreddit.model.Post;
import com.greenfox.myreddit.model.User;
import com.greenfox.myreddit.service.PostService;
import com.greenfox.myreddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedditController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public RedditController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String checkLogin(@ModelAttribute("username") String username) {
        if (!userService.existingUser(username)) {
            userService.createUser(username);
        }
        return "redirect:/posts?user=" + userService.getUserByName(username).getId();
    }

    @GetMapping("/posts")
    public String showPosts(Model model, @RequestParam(defaultValue = "0") int page,
                            @RequestParam(required = false, name = "user") Long id) {
        if (id == null) {
            return "redirect:/login";
        }
        model.addAttribute("userid", id);
        model.addAttribute("posts", postService.getPageablePosts(page));
        return "mainpage";
    }

    @GetMapping("/{id}/upvote")
    public String upVotePost(@PathVariable Long postId, @RequestParam(name = "user") Long userId) {
        postService.upVotePost(postId);
        return "redirect:/posts?user=" + userId;
    }

    @GetMapping("/{id}/downvote")
    public String downVotePost(@PathVariable Long postId, @RequestParam(name = "user") Long userId) {
        postService.downVotePost(postId);
        return "redirect:/posts?user=" + userId;
    }

    @GetMapping("/post/{id}")
    public String showPost(Model model, @PathVariable Long id, @RequestParam(name = "user") Long userId) {
        model.addAttribute("post", postService.getPostById(id));
        model.addAttribute("userid", userId);
        return "post";
    }

    @GetMapping("/submit")
    public String submitPage(Model model, @RequestParam(name = "user") Long id) {
        model.addAttribute("userid", id);
        return "submitpage";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute(name="post") Post post, @RequestParam(name = "user") Long id) {
        Post newpost = post;
        User user = userService.getUser(id);
        newpost.setUser(user);
        user.addPost(post);
        postService.savePost(post);
        userService.saveUser(user);
        return "redirect:/posts?user=" + id;
    }

}
