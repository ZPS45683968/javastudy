package design_patternlearn.BehavioralPattern.responsibility;

/**
 * @Author ps_zhao
 * @Description 抽象处理类
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    //责任链中的下一个元素
    private Handler nextHandler;


    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置责任链中的下一个元素
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //处理请求的方法
    protected abstract void handlerLeave(LeaveRequest leave);

    //提交请求
    public final void submit(LeaveRequest leave) {
        // 该领导进行审批
        this.handlerLeave(leave);
        // 如果有下一个领导
        if (this.nextHandler != null && leave.getLeaveDays() > this.numEnd) {
            // 提交给下一个领导
            this.nextHandler.submit(leave);
        }else {
            System.out.println("流程结束");
        }
    }
}
