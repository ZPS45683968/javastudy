package design_patternlearn.BehavioralPattern.responsibility;

/**
 * @Author ps_zhao
 * @Description 请假条类
 */
public class LeaveRequest {
    private String name;
    private int leaveDays;
    private String content;

    public LeaveRequest(String name, int leaveDays, String content) {
        this.name = name;
        this.leaveDays = leaveDays;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public String getContent() {
        return content;
    }
}
