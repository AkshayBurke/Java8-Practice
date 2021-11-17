package com.burkeak.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream().reduce(1,(a,b)->a*b);
       // return integerList.stream().reduce(2,(a,b)->a%2!=0?a*b:a*2);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream().reduce((a,b)->a*b);
        // return integerList.stream().reduce(2,(a,b)->a%2!=0?a*b:a*2);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,8,3,7,4);
        List<Integer> integers1 = Arrays.asList();
        System.out.println(performMultiplication(integers));
        System.out.println(performMultiplicationWithoutIdentity(integers));
        System.out.println(performMultiplicationWithoutIdentity(integers).get());
        System.out.println(performMultiplicationWithoutIdentity(integers).isPresent());
        if(performMultiplicationWithoutIdentity(integers1).isPresent())
        System.out.println(performMultiplicationWithoutIdentity(integers1).get());

    }
}
