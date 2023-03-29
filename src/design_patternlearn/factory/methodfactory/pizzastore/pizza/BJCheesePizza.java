package design_patternlearn.factory.methodfactory.pizzastore.pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 16:28
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println(" 给制作北京奶酪披萨 准备原材料");
    }
}
