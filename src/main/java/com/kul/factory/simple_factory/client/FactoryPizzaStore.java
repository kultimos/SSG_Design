package com.kul.factory.simple_factory.client;


import com.kul.factory.simple_factory.SimpleFactory;
import com.kul.factory.simple_factory.order.FactoryOrderPizza;

public class FactoryPizzaStore {
    public static void main(String[] args) {
//        FactoryOrderPizza pizza = new FactoryOrderPizza(new SimpleFactory());
        FactoryOrderPizza pizza = new FactoryOrderPizza();
    }
}
