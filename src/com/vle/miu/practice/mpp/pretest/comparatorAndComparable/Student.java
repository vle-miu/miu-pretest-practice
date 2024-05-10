package com.vle.miu.practice.mpp.pretest.comparatorAndComparable;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    public static Comparator<Student> FirstnameComparator = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.firstname.compareTo(o2.firstname);
        }
    };
    public static Comparator<Student> LastnameComparator = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.lastname.compareTo(o2.lastname);
        }
    };
    public static Comparator<Student> IdComparator = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    };
    private Integer id;
    private String firstname;
    private String lastname;

    public Student(Integer id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.id - o.id;

        if (result == 0) {
            result = this.firstname.compareTo(o.firstname);

            if (result == 0) {
                result = this.lastname.compareTo(o.lastname);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(this.id + " - " + this.firstname + " - " + this.lastname);
        return string.toString();
    }

}
