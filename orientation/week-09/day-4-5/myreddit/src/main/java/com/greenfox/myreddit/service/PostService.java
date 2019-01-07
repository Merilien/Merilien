package com.greenfox.myreddit.service;

import com.greenfox.myreddit.model.Post;
import com.greenfox.myreddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class PostService {

    private PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public void savePost(Post post) {
        repository.save(post);
    }

    public void upVotePost(Long id) {
        Post post = repository.findById(id).get();
        post.upVote();
        repository.save(post);
    }

    public void downVotePost(Long id) {
        Post post = repository.findById(id).get();
        post.downVote();
        repository.save(post);
    }

    public Post getPostById(Long id) {
        return repository.findById(id).get();
    }

    public Page<Post> getPageablePosts(int page) {
        return repository.findAll(new PageRequest(page, 10, Sort.by("score").descending()));
    }

}
