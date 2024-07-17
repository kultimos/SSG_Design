package com.kul.singleton.destroy_singleton_serializable;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {
    public static void main(String[] args) throws Exception {
//        writeObjectToFileA();
        Singleton06 singleton06 = readObjectFromFile();
        Singleton06 singleton07 = readObjectFromFile();
        System.out.println(singleton07.hashCode());
        System.out.println(singleton06.hashCode());
//        两个对象的hashcode不一样,说明已经破坏了单例模式
//        当我们加入了readResolve()方法后,可以发现两个对象的hashcode一致了;注意需要保证写数据时,readResolve()方法已经存在,否则读数据时会报错

//        writeObjectToFile();
//        Singleton07 singleton07 = readObjectFromFile07();
//        Singleton07 singleton071= readObjectFromFile07();
//        System.out.println(singleton071.hashCode());
//        System.out.println(singleton07.hashCode());
//        singleton07是通过枚举创建的单例模式,结果就是拿到的对象是相同的
    }

    public static void writeObjectToFileA() throws Exception {
        // 获取Singleton对象
        Singleton06 instance = Singleton06.getInstance();
        // 创建输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\t-wushuai\\Desktop\\a.txt"));
        // 写对象
        oos.writeObject(instance);
        // 释放资源
        oos.close();
    }

    // 向文件中写数据(对象)
    public static void writeObjectToFile() throws Exception {
        // 获取Singleton对象
        Singleton07 instance = Singleton07.INSTANCE;
        // 创建输出流对象
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\t-wushuai\\Desktop\\a.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\t-wushuai\\Desktop\\b.txt"));
        // 写对象
        oos.writeObject(instance);
        // 释放资源
        oos.close();
    }

    // 从文件中读取数据(对象)
    public static Singleton06 readObjectFromFile() throws Exception {
        // 创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\t-wushuai\\Desktop\\a.txt"));
        Singleton06 singleton06 = (Singleton06)ois.readObject();
        ois.close();
        return singleton06;
    }

    // 从文件中读取数据(对象)
    public static Singleton07 readObjectFromFile07() throws Exception {
        // 创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\t-wushuai\\Desktop\\b.txt"));
        Singleton07 singleton07 = (Singleton07)ois.readObject();
        ois.close();
        return singleton07;
    }
}


