package design_patternlearn.BehavioralPattern.strategy;

/**
 * @Author ps_zhao
 * @Description 环境类，促销员
 */
public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow() {
        strategy.show();
    }
}
