package com.burkeak.learn.java8.functionalInterfaces;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {
    static Predicate<Student> p= (p)->p.getGpa()>=3.9;
    static Function<List<Student>, Map<String, Double>> studentFunction = (student -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        student.forEach((stud->{
            if(p.test(stud)){
                studentGradeMap.put(stud.getName(), stud.getGpa());
            }
        }));
        return studentGradeMap;
    });
    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
