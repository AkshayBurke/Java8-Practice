package com.burkeak.learn.java8.functionalInterfaces;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier =()->{
            return new Student("Akshay",4,4.2,"male", Arrays.asList("Cricket","Football"));
        };

        Supplier<List<Student>> studentList = ()-> StudentDataBase.getAllStudents();
        System.out.println("Supplier test : "+studentSupplier.get());
        System.out.println("Supplier Student list test : "+studentList.get());
    }
}
