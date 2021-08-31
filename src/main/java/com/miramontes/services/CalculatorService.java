package com.miramontes.services;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CalculatorService {

    public static Integer add(List<Integer> numbers){
        return
            numbers.stream()
                .filter(Objects::nonNull)
                .collect(
                        Collectors.summingInt(Integer::intValue)
                );
    }


}
