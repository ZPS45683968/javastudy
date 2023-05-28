package design_patternlearn.BehavioralPattern.command;

/**
 * @Author ps_zhao
 * @Description 具体命令类
 */
public class OrderCommand implements Command{
    private SeniorChef seniorChef;
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("订单号：" + order.getDiningTable() + " 厨师正在做：");
        order.getFoodDir().forEach((k,v)->{
            seniorChef.makeFood(k,v);
        });
        System.out.println("订单号：" + order.getDiningTable() + " 做好了");
    }
}
