package com.kul.builder;

public abstract class BikeBuilder {

    protected String type = "";

    protected Bike bike = new Bike();

    public abstract void createFrame();

    public abstract void createSeat();

    public abstract Bike createBike();
}
