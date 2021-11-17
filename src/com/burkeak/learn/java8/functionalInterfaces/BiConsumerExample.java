package com.burkeak.learn.java8.functionalInterfaces;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("Name : "+ name +" | Activities : "+activities);
        List<Student> list = StudentDataBase.getAllStudents();
        list.forEach((student) ->biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer =(a,b)->{
            System.out.println(" a: "+a  +" b : "+b);
        };
        biConsumer.accept("Akshay", "Burke");

        BiConsumer<Integer,Integer> multiply =(a,b)->{
            System.out.println("Multiplication is : "+(a*b));
        };

        BiConsumer<Integer,Integer> division =(a,b)->{
            System.out.println("division is : "+(a/b));
        };
        multiply.andThen(division).accept(10,2);

        nameAndActivities();
    }
}
