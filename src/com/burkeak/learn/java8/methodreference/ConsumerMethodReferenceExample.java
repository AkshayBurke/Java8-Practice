package com.burkeak.learn.java8.methodreference;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    /**
     * classname::methodName
     * */
    static Consumer<Student> c1 = System.out::println;
    /**
     * ClassName::instanceMethodName
     * */
    static Consumer<Student> c2= Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
