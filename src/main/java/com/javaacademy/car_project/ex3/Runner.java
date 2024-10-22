package com.javaacademy.car_project.ex3;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
//        Human.HumanBuilder builder = Human.builder();
//        builder.name("Юрий");
//        builder.secondName("Иванов");
//        Human human = builder.build();
//        builder.secondName("Петров");
//        System.out.println(human);

//        Human.builder().name().secondName().build;

        Human human = Human.builder()
                .name("Юрий")
                .secondName("Иванов")
                .build();
        System.out.println(human);

        System.out.println(Employee.builder()
                .name("Олег")
                .secondName("Петров")
                .salary(BigDecimal.valueOf(10_000))
                .build());

    }
}
