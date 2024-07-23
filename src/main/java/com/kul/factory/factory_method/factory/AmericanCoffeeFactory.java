package com.kul.factory.factory_method.factory;

import com.kul.factory.original.coffee.AmericanCoffee;
import com.kul.factory.original.coffee.Coffee;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        System.out.println("感谢选择美式咖啡工厂的咖啡");
        return new AmericanCoffee();
    }
}
