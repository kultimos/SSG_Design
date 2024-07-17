package com.kul.singleton.destroy_singleton_reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflexClient {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Singleton06 instance = Singleton06.getInstance();
        Class clazz = Singleton06.class;
        // 获取无参构造
        Constructor cons = clazz.getDeclaredConstructor();
        // 取消访问检查
        cons.setAccessible(true);
        // 创建对象
        // 这里之所以通过无参构造的方式获取对象,是因为我们通过使用的clazz.newInstance()方法本质上是获取其构造方法进行实例化,但因为我们单例模式的构造方法都是私有的,
        // 没法直接通过newInstance方法获取对象,所以采取了先获取其私有的无参构造,再爆破去除访问检查,最后再调用无参构造的方式
        Singleton06 o1 = (Singleton06) cons.newInstance();
        Singleton06 o2 = (Singleton06) cons.newInstance();
        System.out.println(o2.hashCode());
        System.out.println(o1.hashCode());

        //再看下反射处理枚举单例的情况
        Class<Singleton07> enumClass = Singleton07.class;
        // 通过反射获取 "INSTANCE" 枚举常量
        Field instanceField = enumClass.getDeclaredField("INSTANCE");
        Singleton07 singleton1 = (Singleton07) instanceField.get(null);
        Singleton07 singleton2 = (Singleton07) instanceField.get(null);
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1.hashCode());
        //可以发现singleton1和singleton2的hashcode是完全一样的
    }

}
