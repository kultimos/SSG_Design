package com.kul.builder;

import javax.annotation.PostConstruct;

public class CircleBikeBuilder extends BikeBuilder{

    public CircleBikeBuilder(String type){
        this.type = type;
    }

    @Override
    public void createFrame() {
        System.out.println("建车架");
        bike.setFrame("嘎嘎轻");
    }

    @Override
    public void createSeat() {
        System.out.println("建座椅");
        bike.setSeat("嘎嘎软");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
