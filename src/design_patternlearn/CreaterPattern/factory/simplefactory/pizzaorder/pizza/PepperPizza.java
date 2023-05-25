package design_patternlearn.CreaterPattern.factory.simplefactory.pizzaorder.pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 15:08
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给制作胡椒披萨 准备原材料");
    }
}
