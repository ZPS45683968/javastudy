package design_patternlearn.BehavioralPattern.responsibility;

/**
 * @Author ps_zhao
 * @Description 部门经理类
 */
public class ManagerLeader extends Handler {
    public ManagerLeader() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getLeaveDays() + "天,理由是:" + leave.getContent());
        System.out.println("部门经理审批:同意");
    }
}

