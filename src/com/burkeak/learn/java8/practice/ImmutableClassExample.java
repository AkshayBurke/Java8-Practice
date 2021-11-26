package com.burkeak.learn.java8.practice;

/*to make class Immutable
 * 1 . Mark class as final so child will not be created
 * 2 . Mark data members as private and final so direct access and data modification is not possible
 * 3 . A parameterized constructor should initialize all the fields performing a deep copy
 *     so that data members can’t be modified with an object reference.
 * 4 . Deep copy of objects should be done in getters, so it will return copy rather than actual reference of objects.
 * */

import java.util.HashMap;
import java.util.Map;

final class ImmutableExample {
    private final int id;
    private final String name;
    private final Map<Integer, String> metaData;


    ImmutableExample(int id, String name, Map<Integer, String> metaData) {
        this.id = id;
        this.name = name;
        Map<Integer, String> temp = new HashMap<>();

        for (Map.Entry<Integer, String> meta : metaData.entrySet()
        ) {
            temp.put(meta.getKey(), meta.getValue());
        }
        this.metaData = temp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, String> getMetaData() {
        Map<Integer, String> temp = new HashMap<>();
        for (Map.Entry<Integer, String> ent : this.metaData.entrySet()) {
            temp.put(ent.getKey(), ent.getValue());
        }
        return temp;
    }
}

public class ImmutableClassExample {
    public static void main(String[] args) {
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"Akshay");
        myMap.put(2,"Rutuja");
        myMap.put(3,"Anjali");
        ImmutableExample i= new ImmutableExample(1,"Akshay",myMap);
        System.out.println(i.getId());
        System.out.println(i.getName());
        System.out.println(i.getMetaData());

        i.getMetaData().put(5,"redjohn");
        System.out.println("Object altered");
        System.out.println(i.getMetaData());


    }
}
