package design_patternlearn.CreaterPattern.factory.simplefactory.pizzaorder.pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 14:46
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料");
    }
}
