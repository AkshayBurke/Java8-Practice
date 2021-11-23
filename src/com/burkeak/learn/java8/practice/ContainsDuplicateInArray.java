package com.burkeak.learn.java8.practice;

import java.util.Arrays;

public class ContainsDuplicateInArray {
    public static boolean containsDuplicate(int[] num){
        Arrays.sort(num);
        for(int i=1;i<num.length;i++){
            if(num[i-1]==num[i]){
                System.out.println("Duplication of element  "+num[i]);
                return true;
            }
        }
        return false;
    }

    public static boolean containsMultipleDuplicate(int[] num){
        Arrays.sort(num);
        int count=0;
        for(int i=1;i<num.length;i++){
            if(num[i-1]==num[i]){
                System.out.println("Duplication of element  "+num[i]);
                count++;
                //return true;
            }
        }
        System.out.println("Number of Duplicate elements are : "+count);

        return count>0;
    }


    public static void main(String[] args) {
        int[] num={5,2,1,4,2,1,2,3,5};
        System.out.println(containsDuplicate(num));
        System.out.println(containsMultipleDuplicate(num));
    }
}
