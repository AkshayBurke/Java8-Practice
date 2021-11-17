package com.burkeak.learn.java8.streams;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static List<Student> filterStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter((StreamsFilterExample::test))
                //.filter(StreamsFilterExample::test1)
                .filter(s->s.getGpa()>=3.6)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(filterStudent());
    }

    private static boolean test(Student student) {
        return student.getGender().equals("female");
    }

    private static boolean test1(Student student) {
        return student.getGpa()>=3.6;
    }
}
