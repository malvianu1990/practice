package com.anupam.com.anupam;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;


public class FunctionalCodingSyntax {


    public static void main(String[] args) {
        Employee employee1 = new Employee("MALE", 65000);
        Employee employee2 = new Employee("FEMALE", 60000);
        Employee employee3 = new Employee("FEMALE", 55000);
        Employee employee4 = new Employee("MALE", 50000);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4);
        //lambda expression to print the details of female employees.
        employees.stream().filter(employee -> employee.getGender().equals("FEMALE")).forEach(System.out::println);
        //lambda expression to print the avg salary of female employees.
        Double average = employees.stream().filter(employee -> employee.getGender().equals("FEMALE")).mapToInt(Employee::getSalary).average().getAsDouble();

        //lambda express to get the total salary of mail employees
        BigInteger sum = BigInteger.ZERO;
        List<Employee> employeeList = employees.stream().map( employee -> {
            sum.add(new BigInteger(employee.getSalary().toString()));
            return employee;
        }).collect(Collectors.toList());
        List<String> list = new ArrayList();
        list.add("One");
        list.add("Two");
        Integer x = Integer.valueOf(1);
        System.out.println(sum);


    }


}
