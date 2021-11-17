package com.burkeak.learn.java8.methodreference;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
//    static Predicate<Student> p1 = (s)->s.getGradeLevel()>=3;
    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThenGradeLevel;

    public static boolean greaterThenGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
