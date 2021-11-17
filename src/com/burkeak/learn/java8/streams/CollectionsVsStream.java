package com.burkeak.learn.java8.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Akshay");
        names.add("Ritz");
        names.add("Sujit");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        System.out.println(names.stream().collect(Collectors.counting()));
        names.stream().forEach(System.out::println);
        names.stream().forEach(System.out::println);

        Stream<String> ns= names.stream();
        ns.forEach(System.out::println);
       //ns.forEach(System.out::println);
    }
}
