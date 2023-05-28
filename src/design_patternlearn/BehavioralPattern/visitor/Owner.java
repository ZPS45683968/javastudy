package design_patternlearn.BehavioralPattern.visitor;

/**
 * @Author ps_zhao
 * @Description 具体访问者角色类（主人）
 */
public class Owner implements Person {
    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗粮");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫粮");
    }
}
