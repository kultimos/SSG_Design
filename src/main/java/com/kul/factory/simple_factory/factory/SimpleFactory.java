package com.kul.factory.simple_factory.factory;

import com.kul.factory.original.coffee.AmericanCoffee;
import com.kul.factory.original.coffee.Coffee;
import com.kul.factory.original.coffee.LatteCoffee;

public class SimpleFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("American".equals(type)) {
            System.out.println("欢迎享用本工厂生产的咖啡");
            coffee = new AmericanCoffee();
        }  else if("Latte".equals(type)) {
            System.out.println("欢迎享用本工厂生产的咖啡");
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("本工厂没有这种咖啡");
        }
        return coffee;
    }
}
