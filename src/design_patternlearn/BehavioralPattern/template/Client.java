package design_patternlearn.BehavioralPattern.template;

/**
 * @Author ps_zhao
 * @Description 客户端
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
    }
}
