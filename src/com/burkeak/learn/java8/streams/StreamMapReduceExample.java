package com.burkeak.learn.java8.streams;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

public class StreamMapReduceExample {

    public static int noOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>3)
                .filter(student -> student.getGender()=="male")
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);
        //return 0;
    }

    public static void main(String[] args) {
        System.out.println("Number of Notebooks : "+noOfNotebooks());
    }
}
