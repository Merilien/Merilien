package com.greenfox.seadog.frontend.services;

import com.greenfox.seadog.frontend.model.Log;
import com.greenfox.seadog.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    @Autowired
    private LogRepository repository;

    public void saveLog(String data, String endpoint) {
        repository.save(new Log(data, endpoint));
    }


}
