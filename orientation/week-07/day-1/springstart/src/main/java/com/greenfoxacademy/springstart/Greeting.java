package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long id;
    private static AtomicLong atomic = new AtomicLong(0);
    private String content;


    public Greeting(String content) {
        this.id = atomic.incrementAndGet();
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
