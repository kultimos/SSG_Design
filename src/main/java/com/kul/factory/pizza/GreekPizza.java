package com.kul.factory.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备希腊披萨原材料");
    }
}
