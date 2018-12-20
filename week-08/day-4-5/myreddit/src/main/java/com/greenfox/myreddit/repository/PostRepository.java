package com.greenfox.myreddit.repository;

import com.greenfox.myreddit.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    @Query(value = "SELECT post FROM Post post ORDER BY post.score DESC")
    List<Post> getOrderedPosts();
}
