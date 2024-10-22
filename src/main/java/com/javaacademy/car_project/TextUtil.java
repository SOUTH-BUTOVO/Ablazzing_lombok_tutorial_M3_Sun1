package com.javaacademy.car_project;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TextUtil {
    private final String XXX = "XXX";

    public String lower(String text) {
        return text.toLowerCase();
    }

    public String addXXX(String text) {
        return text.concat(XXX);
    }
}
