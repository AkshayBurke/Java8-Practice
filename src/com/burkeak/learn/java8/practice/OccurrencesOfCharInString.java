package com.burkeak.learn.java8.practice;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfCharInString {

    public static long countOccurrence(Character ch,String s){
        return s.chars().filter(c->c==ch).count();
    }

    public static void countOccurrenceOfEachChar(String s){
        //char[] ch = s.toCharArray();
        Map<Character,Integer> countMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(countMap.containsKey(s.charAt(i))){
                countMap.put(s.charAt(i),countMap.get(s.charAt(i))+1);
            }else if(s.charAt(i)!=' '){
                countMap.put(s.charAt(i),1);
            }    
        }

        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
        System.out.println("new Approach : ");
        countMap.forEach((k,v)-> System.out.println(k + " : "+ v));
        
    }

    public static void main(String[] args) {
        System.out.println(countOccurrence('a',"akshay"));
        countOccurrenceOfEachChar("rutuja akshay burke");

    }
}
