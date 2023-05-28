package design_patternlearn.BehavioralPattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ps_zhao
 * @Description 服务员类，请求者角色
 */
public class Waiter {

    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command){
        commands.add(command);
    }

    // 发送命令
    public void sendCommand(){
        System.out.println("服务员：新订单来了");
        commands.forEach(Command::execute);
    }
}
