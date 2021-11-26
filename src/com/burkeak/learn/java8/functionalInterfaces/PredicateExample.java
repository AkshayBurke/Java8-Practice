package com.burkeak.learn.java8.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> evenNum = i->{ return i%2==0;};
    static Predicate<Integer> p = i->{ return i%5==0;};

    public static void main(String[] args) {
       System.out.println(evenNum.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    public static void predicateAnd(){
        System.out.println(evenNum.and(p).test(10)); //predicating channing
        System.out.println(evenNum.and(p).test(9));
    }

    public static void predicateOr(){
        System.out.println(evenNum.or(p).test(12)); //predicating channing
        System.out.println(evenNum.or(p).test(8));
    }

    public static void predicateNegate(){
        System.out.println(evenNum.or(p).negate().test(9)); //predicating channing
        System.out.println(evenNum.negate().test(10)); //predicating channing

    }
}
