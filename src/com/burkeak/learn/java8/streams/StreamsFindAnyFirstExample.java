package com.burkeak.learn.java8.streams;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student->student.getGpa()>4)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
            return StudentDataBase.getAllStudents().stream()
                    .filter(student->student.getGpa()<4)
                    .findFirst();
        }


    public static void main(String[] args) {
        Optional<Student> findAny=findAnyStudent();
        if(findAny.isPresent())
            System.out.println(findAny.get());
        else
            System.out.println("No student find");

        Optional<Student> findFirst=findFirstStudent();
        if(findFirst.isPresent())
            System.out.println(findFirst.get());
        else
            System.out.println("No student find");
    }
}
