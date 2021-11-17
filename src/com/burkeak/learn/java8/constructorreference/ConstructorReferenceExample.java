package com.burkeak.learn.java8.constructorreference;

import com.burkeak.learn.java8.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> s= Student:: new;
    static Function<String, Student> studentFunction = Student::new;
    public static void main(String[] args) {
        System.out.println(s.get());
        System.out.println(studentFunction.apply("Akshay"));
    }
}