package com.vle.miu.practice.mpp.pretest.comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        for (int i = 4; i >= 1; i--) {
            Student student = new Student(i, "Firstname " + i, "Lastname " + i);
            students.add(student);
        }

        System.out.println("================== Origninal list ===================");
        printList(students);

        System.out.println("================== Sort by Comparable ===================");
        Collections.sort(students);
        printList(students);

        System.out.println("================== Sort by Comparator Id ===================");
        Collections.sort(students, Student.IdComparator);
        printList(students);

        System.out.println("================== Sort by Comparator Firstname ===================");
        Collections.sort(students, Student.FirstnameComparator);
        printList(students);

        System.out.println("================== Sort by Comparator Lastname ===================");
        Collections.sort(students, Student.LastnameComparator);
        printList(students);

    }

    static void printList(List<Student> list) {
        list.forEach(e -> {
            System.out.println(e.toString());
        });
    }

}
