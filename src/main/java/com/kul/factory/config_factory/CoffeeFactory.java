package com.kul.factory.config_factory;

import com.kul.factory.original.coffee.Coffee;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    private static  HashMap<String, Coffee> map = new HashMap<>();

    static {
        try {
            Properties p = new Properties();
            InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            p.load(is);
            Set<Object> keys = p.keySet();
            for(Object key: keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee)clazz.newInstance();
                map.put((String)key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee createCoffee(String name) {
        return map.get(name);
    }

    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
