package design_patternlearn.BehavioralPattern.visitor;


/**
 * @Author ps_zhao
 * @Description 抽象访问者角色类
 */
public interface Person {

    // 喂食宠物狗
    void feed(Dog dog);
    // 喂食宠物猫
    void feed(Cat cat);
}
