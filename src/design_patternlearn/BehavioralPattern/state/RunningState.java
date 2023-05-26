package design_patternlearn.BehavioralPattern.state;

/**
 * @Author ps_zhao
 * @Description 电梯运行状态类
 */
public class RunningState  extends LiftState {
    @Override
    public void open() {
        //do nothing
    }

    @Override
    public void close() {
        //do nothing
    }

    //运行状态下，电梯不能停止，只能运行或者开门
    @Override
    public void run() {
        System.out.println("电梯正在运行。。。");
    }

    @Override
    public void stop() {
        //状态修改
        super.context.setLiftState(Context.STOPPING_STATE);
        //动作委托为StoppingState来执行
        super.context.stop();
    }
}
