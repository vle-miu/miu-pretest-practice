package com.vle.miu.practice.mpp.pretest.oop.employeeSalary;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.addAll(initialManagerList());
        employees.addAll(initialEmployeeList());

        Double sumOfSalary = 0d;
        for (Employee employee : employees) {
            sumOfSalary += employee.getSalary();
        }

        System.out.println("Sum of salary: " + sumOfSalary);
    }

    static List<Manager> initialManagerList() {
        List<Manager> managers = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Manager manager = new Manager();
            manager.setId(i);
            manager.setName("Name " + i);
            manager.setAge(20 + i);
            managers.add(manager);
        }

        return managers;
    }

    static List<Employee> initialEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 4; i <= 5; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            employee.setName("Name " + i);
            employee.setAge(25 + i);
            employees.add(employee);
        }

        return employees;
    }
}
