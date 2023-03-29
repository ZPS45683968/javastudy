package design_patternlearn.factory.abstractfactory.pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 16:30
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println(" 给制作伦敦奶酪披萨 准备原材料");
    }
}
