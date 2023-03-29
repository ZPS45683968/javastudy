package design_patternlearn.factory.simplefactory.pizzaorder.order;

import design_patternlearn.factory.simplefactory.pizzaorder.pizza.CheesePizza;
import design_patternlearn.factory.simplefactory.pizzaorder.pizza.GreekPizza;
import design_patternlearn.factory.simplefactory.pizzaorder.pizza.Pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 15:08
 */
public class SimpleFactory {

    // 根据orderType返回对应的Pizza对象
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        }else if (orderType.equals("pepper")) {
            pizza = new CheesePizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }
}
