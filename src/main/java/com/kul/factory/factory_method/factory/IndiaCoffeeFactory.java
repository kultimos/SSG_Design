package com.kul.factory.factory_method.factory;

import com.kul.factory.original.coffee.Coffee;
import com.kul.factory.original.coffee.IndiaCoffee;

public class IndiaCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        System.out.println("感谢选择阿三咖啡厂");
        return new IndiaCoffee();
    }
}
