package com.kul.factory.original.coffee;

public abstract class Coffee {


    public void addSuger(){
        System.out.println("加糖");
    }
    public void addMilk() {
        System.out.println("加奶");
    }

    public abstract String  getName();
}
