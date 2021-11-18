package com.burkeak.learn.java8.numericstream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        System.out.println("Sum is : "+IntStream.rangeClosed(1,50).sum());
        System.out.println("Max is : "+IntStream.rangeClosed(0,50).max().getAsInt());
        System.out.println("Min is : "+ LongStream.rangeClosed(50,150).min().getAsLong());
        System.out.println("Avg is : "+ IntStream.rangeClosed(40,151).average().getAsDouble());
        System.out.println("Double - sum is : "+ IntStream.rangeClosed(1,30).asDoubleStream().sum());

    }
}
