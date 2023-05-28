package design_patternlearn.BehavioralPattern.responsibility;

/**
 * @Author ps_zhao
 * @Description 总经理类
 */
public class GeneralLeader extends Handler {
    public GeneralLeader() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getLeaveDays() + "天,理由是:" + leave.getContent());
        System.out.println("总经理审批:同意");
    }
}

