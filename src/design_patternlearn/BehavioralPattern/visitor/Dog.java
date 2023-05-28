package design_patternlearn.BehavioralPattern.visitor;

/**
 * @Author ps_zhao
 * @Description 具体元素角色类
 */
public class Dog implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("狗吃狗粮");
    }
}
