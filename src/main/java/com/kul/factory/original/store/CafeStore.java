package com.kul.factory.original.store;

import com.kul.factory.original.coffee.AmericanCoffee;
import com.kul.factory.original.coffee.Coffee;
import com.kul.factory.original.coffee.LatteCoffee;

public class CafeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("American".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("Latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("没有这种咖啡");
        }
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
