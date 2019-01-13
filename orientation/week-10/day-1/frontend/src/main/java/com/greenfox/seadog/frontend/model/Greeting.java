package com.greenfox.seadog.frontend.model;

public class Greeting {

    private String welcome_message;

    public Greeting(String name, String title) {
        welcome_message = String.format("Oh, hi there %s, my dear %s!", name, title);
    }

    public Greeting(String name) {
        welcome_message = String.format("Oh, hi there %s!", name);
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}
