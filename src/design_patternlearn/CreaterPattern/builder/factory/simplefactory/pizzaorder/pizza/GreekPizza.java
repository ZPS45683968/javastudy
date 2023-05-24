package design_patternlearn.CreaterPattern.builder.factory.simplefactory.pizzaorder.pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 14:47
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给制作希腊披萨 准备原材料");
    }
}
