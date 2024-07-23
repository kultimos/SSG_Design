package com.kul.factory.abstract_factory.client;

import com.kul.factory.abstract_factory.ItalyDessertFactory;
import com.kul.factory.abstract_factory.cafe.Coffee;
import com.kul.factory.abstract_factory.dessert.Dessert;
import com.kul.factory.original.store.CafeStore;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Dessert dessert = factory.createDessert();
        dessert.show();
    }
}
