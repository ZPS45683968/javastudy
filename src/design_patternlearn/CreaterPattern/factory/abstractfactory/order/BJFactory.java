package design_patternlearn.CreaterPattern.factory.abstractfactory.order;

import design_patternlearn.CreaterPattern.factory.abstractfactory.pizza.BJCheesePizza;
import design_patternlearn.CreaterPattern.factory.abstractfactory.pizza.BJPepperPizza;
import design_patternlearn.CreaterPattern.factory.abstractfactory.pizza.Pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 17:12
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用抽象工厂模式");
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
