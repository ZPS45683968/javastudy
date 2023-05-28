package design_patternlearn.BehavioralPattern.visitor;

/**
 * @Author ps_zhao
 * @Description 具体访问者角色类（其他人）
 */
public class Someone implements Person {

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }
}
