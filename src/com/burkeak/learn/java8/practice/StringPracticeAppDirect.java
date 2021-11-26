package com.burkeak.learn.java8.practice;

public class StringPracticeAppDirect {
    //Test Case 1
    //input akshay output akshayay
    //input sagar output agarsay

    //Test Case 2
    //akshay burke --> akshayay urkebay
    //sagar nehe --> agarsay ehenay

    //Test Case 3
    //with special symbol

    public static String transferString(String str) {
        String temp = "";
        if (str.contains(",") || str.contains("!")) {
            temp = "" + str.charAt(str.length()-1);
        }
        System.out.println(str);
        if (str.toUpperCase().startsWith("A")
                || str.toUpperCase().startsWith("E")
                || str.toUpperCase().startsWith("I")
                || str.toUpperCase().startsWith("O")
                || str.toUpperCase().startsWith("U")) {
            return str.concat("ay").replace(temp,"").concat(temp);
        } else {
            str = str.substring(1) + str.charAt(0) + "ay";
        }
        return str.replace(temp,"").concat(temp);
    }

    public static String transferStatement(String sen) {
        String ar[] = sen.split(" ");
        String result = "";
        int count = 0;
        for (String s : ar) {
            count++;
            if (count > 1 && count <= ar.length) {
                result = result + " ";
            }
            result = result.concat(transferString(s));
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(transferStatement("Akshay Burke, from Kotul, Incredible india!"));
    }
}
