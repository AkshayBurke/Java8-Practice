package com.burkeak.learn.java8.functionalInterfaces;

import com.burkeak.learn.java8.data.Student;
import com.burkeak.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    static Predicate<Student> p1= s->s.getGradeLevel()>=3;
    static Predicate<Student> p2= s->s.getGpa()>=3.9;

    BiPredicate<Integer, Double> biPredicate =(gradeLevel,gpa)->gradeLevel>=3 && gpa>=3.9;
    BiConsumer<String, List<String>> studBiConsumer = (name,activities)-> System.out.println(name+" : "+activities);
    Consumer<Student> c = (student)->{
        if(p1.and(p2).test(student)){
            studBiConsumer.accept(student.getName(),student.getActivities());
        }


        /*Bipredicate - accept 2 input values return boolean
         *if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studBiConsumer.accept(student.getName(),student.getActivities());
        }*/
    };
    public void printNameAndActivities(List<Student> studList){
            //studList.forEach(stud->c.accept(stud));
            studList.forEach(c);
    }
    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        //students.forEach(stud->new PredicateAndConsumerExample().c.accept(stud));
        new PredicateAndConsumerExample().printNameAndActivities(students);
    }
}
