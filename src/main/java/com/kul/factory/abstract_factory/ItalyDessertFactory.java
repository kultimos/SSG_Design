package com.kul.factory.abstract_factory;

import com.kul.factory.abstract_factory.cafe.Coffee;
import com.kul.factory.abstract_factory.cafe.LatteCoffee;
import com.kul.factory.abstract_factory.dessert.Dessert;
import com.kul.factory.abstract_factory.dessert.Trimisu;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
