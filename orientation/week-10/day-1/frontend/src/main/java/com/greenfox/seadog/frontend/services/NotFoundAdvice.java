package com.greenfox.seadog.frontend.services;

import com.greenfox.seadog.frontend.model.RestError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UnsupportedOperationException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    RestError notFoundHandler(UnsupportedOperationException ex) {
        return new RestError(ex.getMessage());
    }

}
