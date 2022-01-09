package com.burkeak.learn.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorExample {
    public static void main(String[] args) {
        List<Laptop> lapList = new ArrayList<>();
        lapList.add(new Laptop(5,"dell",455));
        lapList.add(new Laptop(2,"dell",234));
        lapList.add(new Laptop(4,"dell",567));
        lapList.add(new Laptop(8,"dell",212));
        lapList.add(new Laptop(1,"dell",890));

        System.out.println("before Sort");
        System.out.println(lapList);
        Collections.sort(lapList);
        System.out.println("after sort based on comparable");
        System.out.println(lapList);

        System.out.println("Using Comparator");
        lapList.sort(Comparator.comparingInt(Laptop::getPrice));

        System.out.println("after sort based on comparator");
        System.out.println(lapList);
    }
}
