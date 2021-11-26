package com.burkeak.learn.java8.practice;

import java.util.Arrays;

public class TestExample {


    public static void main(String[] args) {
        String s = "dabcDAGC2984";
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String sp = new String(s1);
        System.out.println("sorted :" + new String(sp));
        //output = 2489abcdACDG
        StringBuffer intInput = new StringBuffer();
        StringBuffer smallInput = new StringBuffer();
        StringBuffer capsInput = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                capsInput.append(s.charAt(i));
            } else if (Character.isLowerCase(s.charAt(i))) {
                smallInput.append(s.charAt(i));
            } else if (Character.isDigit(s.charAt(i))) {
                intInput.append(s.charAt(i));
            }
        }

        String sorted = s.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println("Java 8 : " + sorted);

       /* char[] intIn = intInput.getChars();
        char[] smIn = smallInput.toCharArray();
        char[] cpIn = capsInput.toCharArray();

        Arrays.sort(intIn);
        Arrays.sort(smIn);
        Arrays.sort(cpIn);

        String intStr = new String(intIn);
        String smStr = new String(smIn);
        String cpStr = new String(cpIn);
        System.out.println(intStr + smStr + cpStr);*/
    }

    //for O(N) O(N) O(N)
}
