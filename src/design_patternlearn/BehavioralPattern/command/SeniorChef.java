package design_patternlearn.BehavioralPattern.command;

/**
 * @Author ps_zhao
 * @Description 厨师类,命令接收者
 */
public class SeniorChef {
    public void makeFood(String foodName,int foodNum){
        System.out.println("厨师正在做：" + foodName + " 数量：" + foodNum);
    }
}
