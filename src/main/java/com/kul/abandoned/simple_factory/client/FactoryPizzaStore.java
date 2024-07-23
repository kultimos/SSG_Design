package com.kul.abandoned.simple_factory.client;


import com.kul.abandoned.simple_factory.order.FactoryOrderPizza;

public class FactoryPizzaStore {
    public static void main(String[] args) {
//        FactoryOrderPizza pizza = new FactoryOrderPizza(new SimpleFactory());
        FactoryOrderPizza pizza = new FactoryOrderPizza();
    }
}
