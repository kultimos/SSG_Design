package com.kul.factory.simple_factory.client;


import com.kul.factory.original.coffee.Coffee;
import com.kul.factory.original.store.CafeStore;
import com.kul.factory.simple_factory.store.CoffeeStore;

public class Client {
    public static void main(String[] args) {
        CoffeeStore cafeStore = new CoffeeStore();
        Coffee coffee = cafeStore.OrderCoffee("American");
        System.out.println(coffee.getName());
    }
}
