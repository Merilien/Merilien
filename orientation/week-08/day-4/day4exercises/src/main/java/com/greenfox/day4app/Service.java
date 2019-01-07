package com.greenfox.day4app;

import java.util.List;

public interface Service {

    public List<String> findAll();

    public void save(String student);

    public int getCount();

    public boolean checkStudent(String name);
}
