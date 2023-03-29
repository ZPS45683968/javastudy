package design_patternlearn.factory.abstractfactory.order;

import design_patternlearn.factory.abstractfactory.pizza.LDCheesePizza;
import design_patternlearn.factory.abstractfactory.pizza.LDPepperPizza;
import design_patternlearn.factory.abstractfactory.pizza.Pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 17:14
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用抽象工厂模式");
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
