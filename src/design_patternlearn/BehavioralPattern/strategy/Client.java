package design_patternlearn.BehavioralPattern.strategy;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
