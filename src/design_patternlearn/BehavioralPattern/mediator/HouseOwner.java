package design_patternlearn.BehavioralPattern.mediator;

/**
 * @Author ps_zhao
 * @Description 具体同事类
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }


    public void contact(String message) {
        mediator.contract(message, this);
    }


    public void getMessage(String message) {
        System.out.println("房东：" + name + "，获得信息：" + message);
    }
}
