package com.burkeak.learn.java8.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
    static int val1=9;
    public static void main(String[] args) {
        int val=4;
        Consumer<Integer> c1 =(i)->{
            val1++;
            System.out.println(val1+i);
        };
        c1.accept(3);
        printVal();
    }
    static void printVal(){
        System.out.println(val1);
    }
}
