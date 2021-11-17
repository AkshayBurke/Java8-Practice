package com.burkeak.learn.java8.practice;

import java.io.*;
import java.lang.reflect.Constructor;

class SuperClass implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Singleton extends SuperClass implements Serializable {
    /**
     *  Singleton pattern
     */

    private static Singleton sing_instance=null;
    private Singleton(){
        System.out.println("Object got created !");
    }

    public static Singleton getSing_instance(){
        if(sing_instance!=null){
            return sing_instance;
        }else{
            sing_instance=new Singleton();
        }
        return sing_instance;
    }

    /**
    *   Overcome problem of Serialization
    **/
    protected Object readResolve(){
        return sing_instance;
    }

    /**
     *  Overcome problem of Clone
     * @return
     */
    protected Object clone(){
        return sing_instance;
    }
    /*@Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }*/
}

public class SingletonTestExample {
    public static void main(String[] args) {
        Singleton s=Singleton.getSing_instance();
        Singleton s1=Singleton.getSing_instance();
        Singleton s2=Singleton.getSing_instance();

        System.out.println("Hashcode for s : "+s.hashCode());
        System.out.println("Hashcode for s1 : "+s1.hashCode());
        System.out.println("Hashcode for s2 : "+s2.hashCode());

        if(s==s1 && s1==s2 && s2==s){
            System.out.println("All objects are same");
        }

        /**
         *  Break singleton using reflection
         *
         *  Overcome : To overcome the problem raised by reflection enums are used
         *  because java ensure that internally that enum value is instantiated only once
         */
        Singleton s3=null;
        try{
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                s3=(Singleton) constructor.newInstance();
                break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Hashcode for s : "+s2.hashCode());
        System.out.println("hashcode for s3 : "+s3.hashCode());

        /**
         *  Break Singleton using Serialization
         *
         *  Overcome:To overcome the problem raised by serialization we have to implement method readResolve()
         */
        try{

            ObjectOutput out= new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(s);
            out.close();

            ObjectInput in= new ObjectInputStream(new FileInputStream("file.txt"));
            Singleton s4 = (Singleton) in.readObject();
            in.close();

            System.out.println("Hashcode for s : "+s2.hashCode());
            System.out.println("hashcode for s4 : "+s4.hashCode());
        }catch(Exception e){
            e.printStackTrace();
        }

        /**
         *  Break Singleton through cloning
         *
         *  Overcome: To overcome this problem, override clone() method and
         *  throw an exception from clone method that is CloneNotSupportedException.
         *  Or we can override clone() method and return the singleton object from it.
         */
        try{
            Singleton s5 = (Singleton) s.clone();
            System.out.println("Hashcode for s : "+s.hashCode());
            System.out.println("hashcode for s5 : "+s5.hashCode());
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
