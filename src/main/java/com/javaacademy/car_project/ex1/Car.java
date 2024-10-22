package com.javaacademy.car_project.ex1;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
public class Car {
    @Getter
    private String model;
    private int power;
    @Getter
    private BigDecimal price;

}
