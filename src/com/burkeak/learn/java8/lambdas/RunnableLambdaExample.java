package com.burkeak.learn.java8.lambdas;

/**
 *
 * */

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior Java 8
         * */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * Java 8 Lambda
         * ()->{}
         * */
        Runnable runnableLmbda =() ->{
            System.out.println("Inside Runnable 2 with lambda");
        };

        Runnable runnableLambda2 = () -> System.out.println("2nd Way with lambda");

        new Thread(runnableLmbda).start();
        new Thread(runnableLambda2).start();
        new Thread(()-> System.out.println("Direct Way 3"));
    }
}
