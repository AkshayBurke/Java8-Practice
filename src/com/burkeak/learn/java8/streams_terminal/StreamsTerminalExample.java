package com.burkeak.learn.java8.streams_terminal;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import static java.util.stream.Collectors.joining;

public class StreamsTerminalExample {
    public static String joining_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining());
    }
     public static String joining_2(){
            return StudentDataBase.getAllStudents().stream()
                    .map(Student::getName)
                    .collect(joining(" | "));
        }
    public static String joining_3(){
                return StudentDataBase.getAllStudents().stream()
                        .map(Student::getName)
                        .collect(joining(" | ","( "," )"));
            }

    public static void main(String[] args) {
        System.out.println("joining_1 : "+joining_1());
        System.out.println("joining_1 : "+joining_2());
        System.out.println("joining_1 : "+joining_3());
    }
}
