package org.courses.ex6_4;

public enum Vehicles {

    CAR(5000,"black"),
    BUS(10000,"red"),
    MOTORBIKE(2000,"grey");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString(){
        return this.name() + "\t" + this.price + "\t" + this.color;
    }
}
