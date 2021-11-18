package com.burkeak.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
        //        .reduce(0,Integer::max);
                .reduce(0,(x,y)->x>y?x:y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
        //        .reduce(0,Integer::max);
                .reduce((x,y)->x>y?x:y);
    }
    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()
        //        .reduce(0,Integer::max);
                .reduce((x,y)->x<y?x:y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        //List<Integer> integerList = Arrays.asList();
        System.out.println("Max Value : " +(findMaxValueOptional(integerList).isPresent() ? findMaxValueOptional(integerList).get() : "No Max value present !"));
        System.out.println("Min Value : " +(findMaxValueOptional(integerList).isPresent() ? findMinValueOptional(integerList).get() : "No Min value present !"));
    }
}
