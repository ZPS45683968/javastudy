package design_patternlearn.CreaterPattern.factory.methodfactory.pizzastore.order;

import design_patternlearn.CreaterPattern.factory.methodfactory.pizzastore.pizza.BJCheesePizza;
import design_patternlearn.CreaterPattern.factory.methodfactory.pizzastore.pizza.BJPepperPizza;
import design_patternlearn.CreaterPattern.factory.methodfactory.pizzastore.pizza.Pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 16:45
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new BJPepperPizza();
            pizza.setName("北京的希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京的奶酪披萨");
        }
        return pizza;
    }
}
