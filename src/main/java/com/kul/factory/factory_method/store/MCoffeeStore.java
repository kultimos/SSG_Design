package com.kul.factory.factory_method.store;

import com.kul.factory.factory_method.factory.AmericanCoffeeFactory;
import com.kul.factory.factory_method.factory.CoffeeFactory;
import com.kul.factory.original.coffee.Coffee;

public class MCoffeeStore {
    private final CoffeeFactory coffeeFactory;

    public MCoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addSuger();
        coffee.addMilk();
        return coffee;
    }
}
