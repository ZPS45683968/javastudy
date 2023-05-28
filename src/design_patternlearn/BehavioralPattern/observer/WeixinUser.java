package design_patternlearn.BehavioralPattern.observer;

/**
 * @Author ps_zhao
 * @Description 具体观察者角色类
 */
public class WeixinUser implements Observer{
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        // TODO Auto-generated method stub
        System.out.println(name + "-" + message);
    }
}
