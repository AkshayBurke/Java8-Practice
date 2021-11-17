package com.burkeak.learn.java8.functionalInterfaces;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = s->s.toLowerCase().concat(" - Default");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("AKSHAYburke"));
    }
}
