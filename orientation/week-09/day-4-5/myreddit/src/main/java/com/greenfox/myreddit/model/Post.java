package com.greenfox.myreddit.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String url;
    private int score;
    @Temporal(value = TemporalType.DATE)
    private Date date;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    public Post() {
        date = new Date();
        score = 0;
    }

    public void upVote() {
        score++;
    }

    public void downVote() {
        score--;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int votes) {
        this.score = votes;
    }

    public Date getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
