package design_patternlearn.factory.simplefactory.pizzaorder.order;

import design_patternlearn.factory.simplefactory.pizzaorder.pizza.CheesePizza;
import design_patternlearn.factory.simplefactory.pizzaorder.pizza.GreekPizza;
import design_patternlearn.factory.simplefactory.pizzaorder.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 14:48
 */
public class OrderPizza {
    // 定义一个简单工厂对象
    Pizza pizza = null;
    public OrderPizza() {
        String orderType = ""; // 用户输入的
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);
            // 输出pizza 制作过程
            if (pizza != null) { // 订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }


    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
