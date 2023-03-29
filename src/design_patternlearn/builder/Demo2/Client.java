package design_patternlearn.builder.Demo2;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 22:17
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("骁龙865")
                .screen("OLED")
                .memory("8G")
                .mainboard("华为")
                .build();
        System.out.println(phone);
    }
}
