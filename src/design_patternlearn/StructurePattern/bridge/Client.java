package design_patternlearn.StructurePattern.bridge;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem system = new Mac(new AviFile());
        system.play("战狼3");
    }
}
