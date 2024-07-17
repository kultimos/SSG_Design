package com.kul.singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton01 instance = Singleton01.getInstance();
        System.out.println(instance.hashCode());
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance2.hashCode());
        System.out.println(instance2 == instance);
    }
}


class Singleton01 {
    // 1.构造器私有化
    private Singleton01(){}


    // 2.本类内部创建对象实例
    private final static Singleton01 instance1 = new Singleton01();

    // 3.对外提供一个公有的静态方法,返回实例对象
    public static Singleton01 getInstance(){
        return instance1;
    }
}
