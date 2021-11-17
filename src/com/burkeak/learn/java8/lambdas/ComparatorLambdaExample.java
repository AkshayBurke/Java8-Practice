package com.burkeak.learn.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        /**
         * Prior Java 8
         * */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0 --> o1==o2
                                         //1 --> o1>o2
                                         //-1 --> o1<o2
            }
        };
        System.out.println("Result of the comparator is : " + comparator.compare(1,2));

        /**
         * After Java 8
         * */

        Comparator<Integer> comparator1 = (a, b)-> a.compareTo(b);
        // Comparator<Integer> comparator1 = (Integer a, Integer b)-> a.compareTo(b);
        System.out.println("Result using lambda : "+comparator1.compare(3, 2));
    }
}
