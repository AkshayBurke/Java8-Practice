package com.burkeak.learn.java8.streams;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate = s->s.getGradeLevel()>=3;
        Predicate<Student> studentGPAPredicate = s->s.getGpa()>=3.9;
        //students name and there activities in the map
        Map<String, List<String>>studentMap= StudentDataBase.getAllStudents().stream()
                .peek((student->{

                    System.out.println("after stream : "+student);
                }))
                .filter(studentPredicate)
                .peek((student->{System.out.println("after 1st filter : "+student);}))
                .filter(studentGPAPredicate)
                .peek((student->{System.out.println("after 2st filter : "+student);}))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
