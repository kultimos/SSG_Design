package com.kul.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton07 instance = Singleton07.INSTANCE;
        System.out.println(instance.hashCode());
        Singleton07 instance2 = Singleton07.INSTANCE;
        System.out.println(instance2.hashCode());
    }
}


enum Singleton07{
    INSTANCE;
}


