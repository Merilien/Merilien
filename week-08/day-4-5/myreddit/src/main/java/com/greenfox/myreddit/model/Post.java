package com.greenfox.myreddit.model;

import javax.persistence.*;
import java.time.Year;
import java.util.Date;

@Entity
public class Post implements Comparable<Post>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String url;
    private int score;
    @Temporal(value = TemporalType.DATE)
    private Date date;

    public Post() {
        date = new Date();
        score = 0;
    }

    public Post(String title, String url) {
        date = new Date();
        this.title = title;
        this.url = url;
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

    @Override
    public int compareTo(Post o) {
        return this.score-o.getScore();
    }

    public Date getDate() {
        return date;
    }
}
