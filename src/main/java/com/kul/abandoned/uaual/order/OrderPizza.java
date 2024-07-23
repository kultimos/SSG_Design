package com.kul.abandoned.uaual.order;

import com.kul.abandoned.facroty_method.CheesePizza;
import com.kul.abandoned.facroty_method.GreekPizza;
import com.kul.abandoned.facroty_method.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderTypes; //订购pizza的类型
        do {
            orderTypes = getType();
            if (orderTypes.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if(orderTypes.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入披萨类型");
            str = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
