package design_patternlearn.BehavioralPattern.responsibility;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小明", 5, "身体不适");
        // 创建各级领导对象
        Handler groupLeader = new GroupLeader();
        Handler managerLeader = new ManagerLeader();
        Handler generalLeader = new GeneralLeader();

        // 设置各级领导的上级领导
        groupLeader.setNextHandler(managerLeader);
        managerLeader.setNextHandler(generalLeader);

        // 提交请假条
        groupLeader.submit(leave);

    }
}
