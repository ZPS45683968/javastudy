package design_patternlearn.StructurePattern.Proxy.static_proxy;

/**
 * @Author ps_zhao
 * @Description 代售点类
 */
public class ProxyPoint implements SellTickets{

    // 代理点内部包含一个火车站对象
    private TrainStation trainStation = new TrainStation();
    public void sell(){
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
