package design_patternlearn.CreaterPattern.builder.factory.abstractfactory.order;

import design_patternlearn.CreaterPattern.builder.factory.abstractfactory.pizza.Pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 17:11
 */
public interface AbsFactory {
    // 让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
