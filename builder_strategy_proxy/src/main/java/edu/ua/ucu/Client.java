package edu.ua.ucu;

import lombok.Getter;

@Getter
public class Client {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final int age;
    private final Gender gender;

    public Client(String name, int age, Gender gender) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}