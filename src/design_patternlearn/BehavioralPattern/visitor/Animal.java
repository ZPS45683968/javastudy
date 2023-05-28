package design_patternlearn.BehavioralPattern.visitor;

/**
 * @Author ps_zhao
 * @Description 抽象元素角色类
 */
public interface Animal {

    // 接受访问者的访问
    void accept(Person person);
}
