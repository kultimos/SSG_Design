package com.kul.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton03 obj = Singleton03.getInstance();
        System.out.println(obj.hashCode());
        Singleton03 obj2 = Singleton03.getInstance();
        System.out.println(obj2.hashCode());
    }
}

class Singleton03 {
    private Singleton03() {}
    private static Singleton03 instance03;

    public static Singleton03 getInstance() {
        if (instance03 == null) {
            instance03 = new Singleton03();
        }
        return instance03;
    }
}
