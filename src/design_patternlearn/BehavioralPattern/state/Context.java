package design_patternlearn.BehavioralPattern.state;

/**
 * @Author ps_zhao
 * @Description 环境角色类
 */
public class Context {
    // 对应电梯的各种状态
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();

    // 定义一个当前电梯状态变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 把当前环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    // 电梯开启
    public void open() {
        this.liftState.open();
    }

    // 电梯关闭
    public void close() {
        this.liftState.close();
    }

    // 电梯运行
    public void run() {
        this.liftState.run();
    }

    // 电梯停止
    public void stop() {
        this.liftState.stop();
    }

}
