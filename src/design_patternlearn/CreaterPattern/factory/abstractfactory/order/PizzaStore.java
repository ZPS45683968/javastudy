package design_patternlearn.CreaterPattern.factory.abstractfactory.order;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 17:19
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
