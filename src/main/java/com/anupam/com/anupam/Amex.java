package com.anupam.com.anupam;

import io.micrometer.core.instrument.util.JsonUtils;


import javax.script.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

abstract class TestClass {
    private int x = 0;
}

public class Amex {
    public static void main(String[] args) {
        System.out.println(args[1] +args[2]);
    }
}

class MyClass implements  Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getInfo() {
        return "MyClass";
    }

//    public static void main(String[] args) {
//        M
//        myClass.getInfo();
//    }
}

class A {
    A() {
        System.out.println("A");
    }
    class B {
        B() {
            System.out.println("B");
        }
    }
}

 enum Report {
    EMPRPT(1, "EMPLOYEE_REPORT"), MNGRPT(2, "MANAGER_REPORT");
    private String name;
    private int id;
    Report(int id, String name) {
        this.setName(name);
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
}


