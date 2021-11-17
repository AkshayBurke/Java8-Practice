package com.burkeak.learn.java8.practice;

abstract class Pizza{
    String description ="Unknown";
    public String getDescription(){
        return this.description;
    }
    public abstract  int getCost();
}

abstract class ToppingDecorator extends Pizza{
    public abstract String getDescription();
}

class PeppyPaneer extends Pizza{
    public PeppyPaneer(){
        description="PappyPaneer";
    }

    @Override
    public int getCost(){
        return 150;
    }
}

class FarmHouse extends Pizza{
    public FarmHouse(){
        description="FarmHouse";
    }
    @Override
    public int getCost() {
        return 200;
    }
}


class Margheritta extends Pizza{
    public Margheritta(){
        description="Margheritta";
    }
    @Override
    public int getCost() {
        return 100;
    }
}

class ChickenFiesta extends Pizza{
    public ChickenFiesta(){
        description="ChickenFiesta";
    }
    @Override
    public int getCost() {
        return 300;
    }
}
class SimplePizza extends Pizza{
    public SimplePizza(){
        description="SimplePizza";
    }
    @Override
    public int getCost() {
        return 50;
    }
}

class Jalapeno extends ToppingDecorator{
    Pizza pizza;
    public Jalapeno(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Fresh Jalapenos";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+70;
    }
}

class FreshTomato extends ToppingDecorator{
    Pizza pizza;
    public FreshTomato(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Fresh Tomato";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+40;
    }
}

class Paneer extends ToppingDecorator{
    Pizza pizza;
    public Paneer(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+60;
    }
}

class Barbeque extends ToppingDecorator{
    Pizza pizza;
    public Barbeque(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Barbeque";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+100;
    }
}

public class DecoratorDesignPatternExample {
    public static void main(String[] args) {
        Pizza p = new Margheritta();
        System.out.println("Cost of "+p.getDescription()+" is : "+p.getCost());
        Pizza p1 = new SimplePizza();
        p1= new FreshTomato(p1);
        p1=new Jalapeno(p1);
        p1=new Barbeque(p1);
        System.out.println("Cost of "+p1.getDescription()+" is : "+p1.getCost());;
    }
}
