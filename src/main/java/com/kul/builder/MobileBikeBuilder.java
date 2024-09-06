package com.kul.builder;

import javax.annotation.PostConstruct;

public class MobileBikeBuilder extends BikeBuilder{

    public MobileBikeBuilder(String type){
        this.type = type;
    }

    @Override
    public void createFrame() {
        System.out.println("建车架");
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void createSeat() {
        System.out.println("造座椅");
        bike.setSeat("真皮座椅");
    }

    public Bike createBike() {
        return bike;
    }
}
