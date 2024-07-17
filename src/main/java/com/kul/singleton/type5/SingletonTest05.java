package com.kul.singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton05 obj = Singleton05.getInstance();
        System.out.println(obj.hashCode());
        Singleton05 obj2 = Singleton05.getInstance();
        System.out.println(obj2.hashCode());
    }
}

class Singleton05 {
    private Singleton05() {}
    private static volatile Singleton05 instance05;

    public static Singleton05 getInstance() {
        if (instance05 == null) {
            synchronized (Singleton05.class) {
                if (instance05 == null) {
                    instance05 = new Singleton05();
                }
            }
        }
        return instance05;
    }
}
