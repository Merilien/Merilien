package com.greenfox.myreddit.controller;

import com.greenfox.myreddit.model.Post;
import com.greenfox.myreddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedditController {

    private PostService postService;

    @Autowired
    public RedditController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String showPosts(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("posts", postService.getPageablePosts(page));
        return "mainpage";
    }

    @GetMapping("/{id}/upvote")
    public String upVotePost(@PathVariable Long id) {
        postService.upVotePost(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/downvote")
    public String downVotePost(@PathVariable Long id) {
        postService.downVotePost(id);
        return "redirect:/";
    }

    @GetMapping("/post/{id}")
    public String showPost(Model model, @PathVariable Long id) {
        model.addAttribute("post", postService.getPostById(id));
        return "post";
    }

    @GetMapping("/submit")
    public String submitPage() {
        return "submitpage";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute(name="post") Post post) {
        postService.savePost(post);
        return "redirect:/";
    }

}
