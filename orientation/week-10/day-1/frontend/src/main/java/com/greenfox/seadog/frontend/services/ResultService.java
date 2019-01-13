package com.greenfox.seadog.frontend.services;

import com.greenfox.seadog.frontend.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ResultService {

    public Result sumArray(int[] array) {
        return new Result<>(Arrays.stream(array).sum());
    }

    public Result multiplyArray(int[] array) {
        return new Result<>(Arrays.stream(array).reduce(1, (a, b) -> a * b));
    }

    public Result doubleArray(int[] array) {
        return new Result<>(Arrays.stream(array).map(i -> i * 2));
    }


}
