package com.greenfox.foxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<String> tricks;
    private String food;
    private String drink;

    public Fox(String name) {
        tricks = new ArrayList<>();
        this.name = name;
        food = "pizza";
        drink = "lemonade";
    }

    public void learnSkill(String skill) {
        tricks.add(skill);
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return tricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public List<String> getTricks() {
        return tricks;
    }
}
