package com.kul.factory.factory_method.factory;

import com.kul.factory.original.coffee.Coffee;
import com.kul.factory.original.coffee.LatteCoffee;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        System.out.println("感谢选择拿铁咖啡工厂");
        return new LatteCoffee();
    }
}
