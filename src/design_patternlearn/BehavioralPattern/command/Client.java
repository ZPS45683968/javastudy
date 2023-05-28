package design_patternlearn.BehavioralPattern.command;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        // 创建订单1
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDir("鱼香肉丝", 1);
        order1.setFoodDir("宫保鸡丁", 2);
        order1.setFoodDir("米饭", 2);

        // 创建订单2
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDir("水煮肉片", 1);
        order2.setFoodDir("米饭", 2);

        // 创建厨师
        SeniorChef seniorChef = new SeniorChef();

        // 创建命令
        Command orderCommand1 = new OrderCommand(seniorChef, order1);
        Command orderCommand2 = new OrderCommand(seniorChef, order2);

        // 创建调用者
        Waiter waiter = new Waiter();
        waiter.setCommand(orderCommand1);
        waiter.setCommand(orderCommand2);

        // 执行命令

        waiter.sendCommand();
    }
}
