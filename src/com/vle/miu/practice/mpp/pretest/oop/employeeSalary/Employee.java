package com.vle.miu.practice.mpp.pretest.oop.employeeSalary;

public class Employee {

    private static final Double DEFAULT_SALARY = 5000d;

    private Integer id;

    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return DEFAULT_SALARY;
    }

    public String getRole() {
        return "Employee";
    }
}
