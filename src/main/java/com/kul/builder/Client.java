package com.kul.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBikeBuilder("1"));
        Bike bike = director.constructBike();
        System.out.println(bike);
        System.out.println("--------------");
        director = new Director(new CircleBikeBuilder("2"));
        bike = director.constructBike();
        System.out.println(bike);
    }
}
