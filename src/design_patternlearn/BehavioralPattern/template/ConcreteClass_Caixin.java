package design_patternlearn.BehavioralPattern.template;

/**
 * @Author ps_zhao
 * @Description 具体子类，炒菜心
 */
public class ConcreteClass_Caixin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }
    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}

