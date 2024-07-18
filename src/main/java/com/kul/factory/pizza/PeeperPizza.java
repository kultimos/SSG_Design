package com.kul.factory.pizza;

public class PeeperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备Pepper披萨原材料");
    }
}
