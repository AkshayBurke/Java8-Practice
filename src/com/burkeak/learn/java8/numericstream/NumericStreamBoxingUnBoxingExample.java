package com.burkeak.learn.java8.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnBoxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,40)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
            return integerList.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing demo : "+boxing());
        System.out.println("Unboxing demo : "+unBoxing(boxing()));
    }
}
