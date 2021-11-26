package com.burkeak.learn.java8.numericstream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        System.out.println("IntStream Range Count : "+IntStream.range(1,50).count());
        IntStream.range(1,50).forEach(i-> System.out.print(i+" , "));
        System.out.println("\nIntStream Range Closed Count : "+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(i-> System.out.print(i+" , "));

        System.out.println("Long Range Count : "+IntStream.range(1,50).count());
        LongStream.range(1,50).forEach(i-> System.out.print(i+" , "));
        System.out.println("\nLong Range Closed Count : "+IntStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(i-> System.out.print(i+" , "));

        System.out.println("\nDouble Stream");
        IntStream.range(1,50).asDoubleStream().forEach(i-> System.out.print(i+" , "));

    }
}
