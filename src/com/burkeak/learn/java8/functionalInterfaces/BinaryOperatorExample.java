package com.burkeak.learn.java8.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> testComparator = (a,b)->a.compareTo(b);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryTest = (a,b)->a*b;
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(testComparator);
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(testComparator);
        System.out.println(binaryTest.apply(45,3));
        System.out.println(maxBy.apply(4,5));
        System.out.println(minBy.apply(4,5));
    }
}
