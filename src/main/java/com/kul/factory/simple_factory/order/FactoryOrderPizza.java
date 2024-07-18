package com.kul.factory.simple_factory.order;

import com.kul.factory.simple_factory.SimpleFactory;
import com.kul.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryOrderPizza {

    public FactoryOrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    /**
     * 静态工厂实现方式
     */
    public FactoryOrderPizza() {
        do {
            Pizza pizza = SimpleFactory.createPizza2(getType());
            if(pizza != null) {
                System.out.println("订购成功");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        do {
            Pizza pizza = simpleFactory.createPizza(getType());
            if(pizza != null) {
                System.out.println("订购成功");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
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
