package com.anupam.com.anupam;

public class Employee {
    private String gender;
    private Integer salary;

    public Employee(String gender, Integer salary) {
        this.gender = gender;
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
