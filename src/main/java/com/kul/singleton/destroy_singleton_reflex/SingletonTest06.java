package com.kul.singleton.destroy_singleton_reflex;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton06 obj = Singleton06.getInstance();
        System.out.println(obj.hashCode());
        Singleton06 obj2 = Singleton06.getInstance();
        System.out.println(obj2.hashCode());
    }
}

class Singleton06 {
    private static boolean flag = false;
    private Singleton06() {
        synchronized (Singleton06.class) {
            // 判断flag的值是否为true,true表示不是第一次访问
            if(flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }

    }

    private static class SingletonInstance {
        private static final Singleton06 INSTANCE06 = new Singleton06();
    }

    public static Singleton06 getInstance() {
        return SingletonInstance.INSTANCE06;
    }

}
