package com.kul.factory.factory_method.client;

import com.kul.factory.factory_method.factory.AmericanCoffeeFactory;
import com.kul.factory.factory_method.factory.IndiaCoffeeFactory;
import com.kul.factory.factory_method.store.MCoffeeStore;

public class MClient {
    public static void main(String[] args) {
        MCoffeeStore coffeeStore = new MCoffeeStore(new IndiaCoffeeFactory());
        coffeeStore.orderCoffee();
    }
}
