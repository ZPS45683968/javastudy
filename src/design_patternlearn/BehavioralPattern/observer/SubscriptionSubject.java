package design_patternlearn.BehavioralPattern.observer;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ps_zhao
 * @Description 具体主题角色类
 */
public class SubscriptionSubject implements Subject {
    //订阅者列表
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            // 遍历订阅者列表，通知每一个订阅者
            observer.update(message);
        }
    }
}
