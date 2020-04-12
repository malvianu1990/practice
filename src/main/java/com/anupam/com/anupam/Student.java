package com.anupam.com.anupam;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> numbers = new ArrayList<>();

    public Student(String name, Integer number) {
        this.name = name;
        this.numbers.add(number);
    }
}
