package com.javaacademy.car_project.ex1;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        //Car car = new Car("Audi", 180, BigDecimal.TEN);
        System.out.println(new Car("Audi", 180, BigDecimal.TEN));

        Car emptyCar = new Car();

        Truck truck = new Truck("Bmw", 100);
//        truck.setFuel(null); // Будет НПЕ
        System.out.println(truck);

    }
}
