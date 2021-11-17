package com.burkeak.learn.java8.streams;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentByGPA(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGPADesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(System.out::println);
        System.out.println("Sorted by name");
        sortStudentByName().forEach(System.out::println);
        System.out.println("Sorted by GPA");
        sortStudentByGPA().forEach(System.out::println);
        System.out.println("Sorted by GPA Desc");
        sortStudentByGPADesc().forEach(System.out::println);
    }

}
