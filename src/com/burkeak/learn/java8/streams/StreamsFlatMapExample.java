package com.burkeak.learn.java8.streams;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> studentActivities(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .collect(toList());
    }

    public static List<String> studentDistinctActivities(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() //return distinct result from pipeline
                .collect(toList());
    }

    public static long studentCountActivities(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() //return distinct result from pipeline
                .count();
    }

    public static List<String> studentSortedActivities(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() //return distinct result from pipeline
                .sorted().collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(studentActivities());
        System.out.println(studentDistinctActivities());
        System.out.println(studentCountActivities());
        System.out.println(studentSortedActivities());
    }
}
