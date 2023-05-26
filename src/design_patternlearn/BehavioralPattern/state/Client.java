package design_patternlearn.BehavioralPattern.state;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //创建环境角色类
        Context context = new Context();
        //设置初始状态
        context.setLiftState(Context.CLOSING_STATE);
        //运行
        context.run();
        //停止
        context.stop();
        //开门
        context.open();
        //关门
        context.close();
    }
}
