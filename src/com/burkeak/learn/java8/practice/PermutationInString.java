package com.burkeak.learn.java8.practice;

import java.util.HashSet;
import java.util.Set;

public class PermutationInString {

    public static Set<String> mySet=new HashSet<>();

    public static Set<String> getPermutation(String s1, String ans){
        if(s1.length()==0){
            mySet.add(ans);
            return null;
        }
       //abc
        for(int i = 0 ;i<s1.length();i++){
            char ch= s1.charAt(i); //a
            String ros=s1.substring(0,i)+s1.substring(i+1);
            getPermutation(ros,ans+ch);
        }
        return mySet;
    }

    public static boolean checkInclusion(String s1, String s2){
        if(s1==null){
            return false;
        }else{
            Set<String> permutations = getPermutation(s1,"");
            System.out.println(permutations);
            if(null!=permutations){
                for (String s: permutations) {
                    if(s2.contains(s)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("abc","xyztcbaab"));
    }
}
