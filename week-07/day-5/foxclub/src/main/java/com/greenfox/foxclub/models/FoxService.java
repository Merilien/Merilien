package com.greenfox.foxclub.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    private List<Fox> foxes;
    private Fox activeFox;
    private List<String> foodoptions;
    private List<String> drinkoptions;

    public FoxService() {
        foxes = new ArrayList<>();
        foodoptions = new ArrayList<>();
        foodoptions.add("pizza");
        foodoptions.add("salad");
        foodoptions.add("taco");
        foodoptions.add("ramen");
        foodoptions.add("sushi");
        foodoptions.add("cake");
        foodoptions.add("ice-cream");
        foodoptions.add("popcorn");
        drinkoptions = new ArrayList<>();
        drinkoptions.add("tea");
        drinkoptions.add("coffee");
        drinkoptions.add("vodka");
        drinkoptions.add("whiskey");
        drinkoptions.add("coke");
        drinkoptions.add("water");
        drinkoptions.add("coconut milk");
        drinkoptions.add("blood of their enemy");
    }

    public void addFox(String name) {
        foxes.add(new Fox(name));
    }

    public Fox getFoxByName(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }

    public boolean isNewName(String name) {
        if (foxes.size() == 0) {
            return true;
        } else if (getFoxByName(name) == null) {
            return true;
        }
        return false;
    }

    public void activateFox(String name) {
        activeFox = getFoxByName(name);
    }

    public Fox getActiveFox() {
        return activeFox;
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public List<String> getFoodoptions() {
        return foodoptions;
    }

    public List<String> getDrinkoptions() {
        return drinkoptions;
    }
}
