package design_patternlearn.BehavioralPattern.state;

/**
 * @Author ps_zhao
 * @Description 电梯关闭状态类
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        //状态修改
        super.context.setLiftState(Context.OPENING_STATE);
        //动作委托为OpeningState来执行
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭了。。。");
    }

    @Override
    public void run() {
        //状态修改
        super.context.setLiftState(Context.RUNNING_STATE);
        //动作委托为RunningState来执行
        super.context.run();
    }

    @Override
    public void stop() {
        //状态修改
        super.context.setLiftState(Context.STOPPING_STATE);
        //动作委托为StoppingState来执行
        super.context.stop();
    }
}
