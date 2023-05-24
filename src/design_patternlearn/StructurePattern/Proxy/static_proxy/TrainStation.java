package design_patternlearn.StructurePattern.Proxy.static_proxy;

/**
 * @Author ps_zhao
 * @Description 火车站类
 */
public class TrainStation implements SellTickets{

    public void sell(){
        System.out.println("火车站卖票");
    }
}
