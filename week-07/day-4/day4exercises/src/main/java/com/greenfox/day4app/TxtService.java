package com.greenfox.day4app;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TxtService implements com.greenfox.day4app.Service {
    ArrayList<String> names;

    public TxtService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int getCount() {
        return names.size();
    }

    public boolean checkStudent(String name) {
        return names.contains(name);
    }
}