package com.vle.miu.practice.mpp.pretest.oop.employeeSalary;

public class Manager extends Employee {

    private static final Double MANAGER_SALARY = 10000d;

    @Override
    public Double getSalary() {
        return MANAGER_SALARY;
    }

    @Override
    public String getRole() {
        return "Manager";
    }

}
