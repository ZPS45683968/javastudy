package design_patternlearn.BehavioralPattern.observer;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        // 创建公众号对象
        SubscriptionSubject mSubscriptionSubject = new SubscriptionSubject();

        // 订阅者公众号
        mSubscriptionSubject.attach(new WeixinUser("张三"));
        mSubscriptionSubject.attach(new WeixinUser("李四"));
        mSubscriptionSubject.attach(new WeixinUser("王五"));

        // 公众号更新发出消息给订阅者
        mSubscriptionSubject.notify("java的专栏更新了");

    }
}
