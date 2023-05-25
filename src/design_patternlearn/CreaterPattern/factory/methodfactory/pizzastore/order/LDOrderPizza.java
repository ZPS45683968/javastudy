package design_patternlearn.CreaterPattern.factory.methodfactory.pizzastore.order;

import design_patternlearn.CreaterPattern.factory.methodfactory.pizzastore.pizza.LDCheesePizza;
import design_patternlearn.CreaterPattern.factory.methodfactory.pizzastore.pizza.LDPepperPizza;
import design_patternlearn.CreaterPattern.factory.methodfactory.pizzastore.pizza.Pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 16:48
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
