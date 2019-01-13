package com.greenfox.seadog.frontend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endpoint;
    private String data;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;

    public Log() {
        createdAt = new Date();
    }

    public Log(String data, String endpoint) {
        createdAt = new Date();
        this.data = data;
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
