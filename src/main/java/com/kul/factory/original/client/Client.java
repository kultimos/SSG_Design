package com.kul.factory.original.client;

import com.kul.factory.original.coffee.Coffee;
import com.kul.factory.original.store.CafeStore;

public class Client {
    public static void main(String[] args) {
        CafeStore cafeStore = new CafeStore();
        Coffee coffee = cafeStore.orderCoffee("American");
        System.out.println(coffee.getName());
    }
}
