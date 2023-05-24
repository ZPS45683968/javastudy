package design_patternlearn.CreaterPattern.builder.factory.abstractfactory.pizza;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 16:29
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println(" 给制作伦敦胡椒披萨 准备原材料");
    }
}
