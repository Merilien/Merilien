package com.greenfox.myreddit.service;

import com.greenfox.myreddit.model.User;
import com.greenfox.myreddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(String username) {
        repository.save(new User(username));
    }

    public void saveUser(User user) {
        repository.save(user);
    }

    public User getUser(Long id) {
        return repository.findById(id).get();
    }

    public User getUserByName(String name) {
        return repository.findByUsername(name);
    }

    public boolean existingUser(String name) {
        return repository.existsByUsername(name);
    }

}
