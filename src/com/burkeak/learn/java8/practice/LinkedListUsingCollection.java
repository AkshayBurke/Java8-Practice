package com.burkeak.learn.java8.practice;

import java.util.LinkedList;

public class LinkedListUsingCollection {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Akshay");
        names.add("Rutuja");
        names.add("Ankit");
        names.add("Rohit");
        names.add("Roshan");
        System.out.println("display");
        System.out.println(names);
        names.add(2,"sagar");
        names.addFirst("rohan");
        System.out.println("display");
        System.out.println(names);
        names.remove();
        names.removeFirstOccurrence("Rohit");
        System.out.println("display");
        System.out.println(names);

    }
}
