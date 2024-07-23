package com.kul.factory.abstract_factory;

import com.kul.factory.abstract_factory.cafe.Coffee;
import com.kul.factory.abstract_factory.dessert.Dessert;

public interface  DessertFactory {

    Coffee createCoffee();
    Dessert createDessert();
}
