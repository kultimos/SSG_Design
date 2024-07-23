package com.kul.factory.abstract_factory.cafe;

public abstract class Coffee {
    public abstract String getName();

    public void addSuger(){
        System.out.println("加糖");
    }
    public void addMilk() {
        System.out.println("加奶");
    }
}
