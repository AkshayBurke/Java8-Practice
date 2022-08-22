package com.burkeak.learn.java8.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> func = (name)->name.toUpperCase();
    static Function<String, String> func1 = (name)->name.toUpperCase().concat("-default");
    public static void main(String[] args) {
        System.out.println("Name in uppercase : "+ func.apply("aKsHay"));
        System.out.println("Result of andThen : "+ func.andThen(func1).apply("aKsHay")); // execute in order they mentioned
        System.out.println("Result of compose method : "+ func.compose(func1).apply("aKsHay")); // first execute argument function and then calle function
    }
}
