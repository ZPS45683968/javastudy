package design_patternlearn.CreaterPattern.builder.Demo1;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 21:27
 */
public class Client {
    public static void main(String[] args) {
        //创建指挥者
        Director director = new Director(new MobiBuilder());
        //获取建造者创建的产品
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
