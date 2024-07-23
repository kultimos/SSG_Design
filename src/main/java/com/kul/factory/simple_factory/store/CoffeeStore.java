package com.kul.factory.simple_factory.store;

import com.kul.factory.original.coffee.Coffee;
import com.kul.factory.simple_factory.factory.SimpleFactory;

public class CoffeeStore {
    public Coffee OrderCoffee(String type) {
        Coffee coffee = SimpleFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSuger();
        coffee.getName();
        return coffee;
    }
}
