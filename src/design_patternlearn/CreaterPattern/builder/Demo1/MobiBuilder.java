package design_patternlearn.CreaterPattern.builder.Demo1;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 21:17
 * @ description 具体建造者，摩拜单车
 */
public class MobiBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜的车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜的座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
