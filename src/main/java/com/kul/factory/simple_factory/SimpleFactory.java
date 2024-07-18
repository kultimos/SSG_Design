package com.kul.factory.simple_factory;

import com.kul.factory.pizza.CheesePizza;
import com.kul.factory.pizza.GreekPizza;
import com.kul.factory.pizza.PeeperPizza;
import com.kul.factory.pizza.Pizza;

public class SimpleFactory {
    /**
     * 普通工程
     */
    public Pizza createPizza(String type) {
        System.out.println("实用简单工厂模式");
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if(type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if(type.equals("pepper")) {
            pizza = new PeeperPizza();
            pizza.setName("Pepper披萨");
        }
    return pizza;
    }

    /**
     * 静态工厂
     */
    public static Pizza createPizza2(String type) {
        System.out.println("实用简单工厂模式静态方法版");
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if(type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if(type.equals("pepper")) {
            pizza = new PeeperPizza();
            pizza.setName("Pepper披萨");
        }
        return pizza;
    }
}
