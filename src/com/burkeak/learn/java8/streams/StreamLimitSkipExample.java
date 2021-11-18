package com.burkeak.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> limitTest(List<Integer> integerList, int n){

        return integerList.stream().limit(n).reduce(Integer::sum);
    }
     public static Optional<Integer> skipTest(List<Integer> integerList, int n){

            return integerList.stream().skip(n).reduce(Integer::sum);
        }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println("Sum of first 3 element is : "+(limitTest(integerList,3).isPresent()?limitTest(integerList,3).get():"Empty List !"));
        System.out.println("Sum of element by skipping first 3 element is : "+(skipTest(integerList,2).isPresent()?skipTest(integerList,2).get():"Empty List !"));
    }
}
