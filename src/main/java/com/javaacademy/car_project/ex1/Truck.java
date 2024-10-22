package com.javaacademy.car_project.ex1;

import lombok.*;

//@RequiredArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
@EqualsAndHashCode(of = "model")
//@ToString(exclude = {"model", "fuel"})
public class Truck {
    private final String model; // Модель грузовика
    @ToString.Exclude
    //@EqualsAndHashCode.Exclude
    private Wheel safeWheel; // Запасное колесо
    @NonNull
    //@EqualsAndHashCode.Exclude
    private Integer fuel;
}
