package com.kul.builder;

public class Director {

    private BikeBuilder builder;

    public Director(BikeBuilder builder){
        this.builder = builder;
    }

    public Bike constructBike() {
        if(builder.type.equals("1")) {
            builder.createSeat();
            builder.createFrame();
        } else {
            builder.createFrame();
            builder.createSeat();
        }
        return builder.createBike();
    }
}
