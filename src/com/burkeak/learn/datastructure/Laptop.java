package com.burkeak.learn.datastructure;

public class Laptop implements Comparable<Laptop>{
    private int id;
    private String brand;
    private int price;

    public Laptop(){}
    public Laptop(int id, String brand, int price){
        this.id=id;
        this.brand=brand;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return this.getId()+" | "+this.getBrand()+ " | "+this.getPrice();
    }

    @Override
    public int compareTo(Laptop l2){
        return this.getId()>l2.getId()?1:-1;
    }

}
