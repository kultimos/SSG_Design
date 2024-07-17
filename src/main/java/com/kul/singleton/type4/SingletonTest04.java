package com.kul.singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton04 obj = Singleton04.getInstance();
        System.out.println(obj.hashCode());
        Singleton04 obj2 = Singleton04.getInstance();
        System.out.println(obj2.hashCode());
    }
}

class Singleton04 {
    private Singleton04() {}
    private static Singleton04 instance04;

    public static synchronized Singleton04 getInstance() {
        if (instance04 == null) {
            instance04 = new Singleton04();
        }
        return instance04;
    }
}
