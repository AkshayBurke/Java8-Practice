package com.burkeak.learn.java8.functionalInterfaces;

public class FunctionExample1 {

    public static String perform(String str) {
        return FunctionExample.func.compose(FunctionExample.func1).apply(str);
    }
    public static void main(String[] args) {
        String result = perform("akshay");
        System.out.println(result);
    }
}
