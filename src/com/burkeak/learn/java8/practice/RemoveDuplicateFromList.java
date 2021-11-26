package com.burkeak.learn.java8.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        int[] list={6,1,4,3,2,4,5,5,5,2,1,3};
        IntStream intStream = Arrays.stream(list).distinct().sorted();
        intStream.forEach(System.out::println);
    }
}
