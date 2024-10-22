package com.javaacademy.car_project.ex2;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        try {
            write();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SneakyThrows
    private static void write() {
        @Cleanup FileWriter writer = new FileWriter("my_file.txt");
        writer.write("Какой то текст");
        throw new Exception("Исключение");
    }
}
