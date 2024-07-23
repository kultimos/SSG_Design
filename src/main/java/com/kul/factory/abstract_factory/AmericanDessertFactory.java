package com.kul.factory.abstract_factory;

import com.kul.factory.abstract_factory.cafe.AmericanCoffee;
import com.kul.factory.abstract_factory.cafe.Coffee;
import com.kul.factory.abstract_factory.dessert.Dessert;
import com.kul.factory.abstract_factory.dessert.MatchaMouse;

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMouse();
    }
}
