package com.burkeak.learn.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String, String> toUpperCaseLambda = s->s.toUpperCase();
    static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("akshay"));
        System.out.println(toUpperCaseMethodRef.apply("akshay"));
    }
}
