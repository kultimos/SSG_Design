package com.kul.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton02 instance = Singleton02.getInstance();
        System.out.println(instance);
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance2);;
    }
}

class Singleton02 {
    private Singleton02() {};
    private static Singleton02 instance;

    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
