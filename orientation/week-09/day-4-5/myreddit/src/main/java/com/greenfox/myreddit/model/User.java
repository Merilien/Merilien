package com.greenfox.myreddit.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String username;

    @OneToMany
    private List<Post> posts;

    public User() {
        username = "";
        posts = new ArrayList<>();
    }

    public User(String username) {
        this.username = username;
        posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
