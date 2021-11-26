package com.burkeak.learn.java8.practice;

import java.util.HashSet;
import java.util.Set;

public class StringOperationsPractice {
    public static void main(String[] args) {
        //compareTo & compareToIgnoreCase
        String text = "AkshAy";
        int val1 = text.compareTo("akshay");
        int val2 = text.compareTo("Akshay");
        int val3 = text.compareToIgnoreCase("aKsHaY");

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

        //charAt & indexOf
        System.out.println(text.charAt(3));
        System.out.println(text.indexOf('z'));
        System.out.println(text.toLowerCase().indexOf('a'));

        //codePointAr/codePointBefore/codePointCount
        String text1 = "samplecodez";

        int codeAt = text1.codePointAt(1);
        int codeAtBefore = text1.codePointBefore(2);
        int codeCount = text1.codePointCount(1, 6);
        boolean contain1 = text1.contains("code");
        boolean contain2 = text1.contains("co De");

        char[] ch = text1.toCharArray();
        int len = text1.length();
        Set<Character> s = new HashSet<>();

        if (!s.add(ch[0])) {
            System.out.println("duplication is there!");
        }

        System.out.println("ASCII value of 'a' : " + codeAt);
        System.out.println("ASCII value of 'a' : " + codeAtBefore);
        System.out.println("Char count is : " + codeCount);

        System.out.println("\nCheck the content is " +
                "available in the string or not : " + contain1);
        System.out.println("Check the content is " +
                "available in the string or not : " + contain2);

        //startsWith() / endsWith()

        String text2 = "Rutuja";
        System.out.println(text2.startsWith("tuja"));
        System.out.println(text2.startsWith("ru"));
        System.out.println(text2.startsWith("Ru"));
        System.out.println(text2.endsWith("ja"));

        /*
         * Swap 2 strings without using 3rd variable
         * */
        String s2 = "one";
        String s3 = "two";
        s2 = s2 + s3;
        s3 = s2.substring(0, (s2.length() - s3.length()));
        s2 = s2.substring(s3.length());
        System.out.println("swap : " + s2 + s3);

        /*
        * String/StringBuffer/StringBuilder
        */

        StringBuffer sb= new StringBuffer();

    }
}
