package com.greenfox.myreddit.repository;

import com.greenfox.myreddit.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {


    @Query(value = "SELECT post FROM Post post ORDER BY post.score DESC")
    List<Post> getOrderedPosts();


}
