package com.greenfox.seadog.frontend.model;

public class RestError {
    private String error;

    public RestError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
