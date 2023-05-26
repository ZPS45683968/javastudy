package design_patternlearn.BehavioralPattern.state;

/**
 * @Author ps_zhao
 * @Description 电梯停止状态类
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        //状态修改
        super.context.setLiftState(Context.OPENING_STATE);
        //动作委托为OpeningState来执行
        super.context.open();
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
        //状态修改
        super.context.setLiftState(Context.RUNNING_STATE);
        //动作委托为RunningState来执行
        super.context.run();
    }

    // 停止状态下，电梯不能开门，只能运行或者关门
    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
