package design_patternlearn.StructurePattern.facade;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开");
        facade.say("关闭");
        facade.say("我不知道你在说什么");
    }
}
