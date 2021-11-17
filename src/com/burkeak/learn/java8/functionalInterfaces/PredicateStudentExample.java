package com.burkeak.learn.java8.functionalInterfaces;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (s)->s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s)->s.getGpa()>=3.9;
    public static  void filterStudentByGradeLevel(){
        List<Student> l= StudentDataBase.getAllStudents();
        System.out.println("Using Predicate");
        l.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static  void filterStudentByGradeLevelAndGPA(){
        List<Student> l= StudentDataBase.getAllStudents();
        System.out.println("Using Predicate And");
        l.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static  void filterStudentByGradeLevelOrGPA(){
        List<Student> l= StudentDataBase.getAllStudents();
        System.out.println("Using Predicate Or");
        l.forEach(student -> {
            if(p1.or(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static  void filterStudentNorByGradeLevelNorGPA(){
        List<Student> l= StudentDataBase.getAllStudents();
        System.out.println("Using Predicate Negate");
        l.forEach(student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGradeLevelAndGPA();
        filterStudentByGradeLevelOrGPA();
        filterStudentNorByGradeLevelNorGPA();
    }
}
