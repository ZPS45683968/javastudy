package design_patternlearn.BehavioralPattern.state;

/**
 * @Author ps_zhao
 * @Description 电梯开启状态类
 */
public class OpeningState extends LiftState {
    //当前状态要执行的方法
    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        //动作委托为ClosingState来执行
        super.context.close();
    }

    @Override
    public void run() {
        //do nothing
    }

    @Override
    public void stop() {
        //do nothing
    }
}
