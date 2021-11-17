package com.burkeak.learn.java8.functionalInterfaces;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class consumerExample {
    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student)-> System.out.print(student.getName());
    static Consumer<Student> c4 = (student)-> System.out.println(" - > "+student.getActivities());
    //static Consumer<Student> c5 = (student)-> System.out.println(student.getGender());

    public static  void print(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }
    public static void printNameAndActivities(){
        List<Student> list = StudentDataBase.getAllStudents();
        list.forEach(c3.andThen(c4)); // consumer channing
        //list.forEach(c3.andThen(c4).andThen(c5));
    }
    public static void printNameAndActivitiesUsingCondition(){
        List<Student> list = StudentDataBase.getAllStudents();
        list.forEach((student->{
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                c3.andThen(c4).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
        c1.accept("akshay burke");
        //print();
        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
