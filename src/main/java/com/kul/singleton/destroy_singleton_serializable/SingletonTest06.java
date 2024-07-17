package com.kul.singleton.destroy_singleton_serializable;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton06 obj = Singleton06.getInstance();
        System.out.println(obj.hashCode());
        Singleton06 obj2 = Singleton06.getInstance();
        System.out.println(obj2.hashCode());
    }
}

class Singleton06 extends SerializableSerializer {
    private Singleton06() {}

    private static class SingletonInstance {
        private static final Singleton06 INSTANCE06 = new Singleton06();
    }

    public static Singleton06 getInstance() {
        return SingletonInstance.INSTANCE06;
    }

    /**
     * 当进行反序列化时会自动调用该方法
     * @return
     */
    public Object readResolve() {
        return SingletonInstance.INSTANCE06;
    }
}
