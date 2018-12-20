package com.greenfox.connecting.model;

import javax.persistence.*;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Boolean urgent;
    private Boolean done;

    public Todo() {
        urgent = false;
        done = false;
    }

    public Todo(String title) {
        this.title = title;
        urgent = false;
        done = false;
    }

    public Todo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public Boolean getDone() {
        return done;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
