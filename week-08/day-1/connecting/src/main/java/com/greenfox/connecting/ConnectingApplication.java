package com.greenfox.connecting;

import com.greenfox.connecting.model.Todo;
import com.greenfox.connecting.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectingApplication implements CommandLineRunner {

    @Autowired
    private TodoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ConnectingApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("Pick up present", true, true));
        repository.save(new Todo("Buy food"));
        repository.save(new Todo("Go to Lush", true, false));
    }
}

