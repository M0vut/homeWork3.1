package com.example.homework31.model;

import org.junit.jupiter.api.Test;

public class Person  {
    private final String name;
    private final String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    public String getSurName() {
        return surName;
    }
}
