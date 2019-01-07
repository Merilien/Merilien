package com.greenfox.connecting.repository;

import com.greenfox.connecting.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAll();

    List<Todo> findAllByDoneIsTrue();

}
