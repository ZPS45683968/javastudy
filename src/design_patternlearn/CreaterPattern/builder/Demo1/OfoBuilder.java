package design_patternlearn.CreaterPattern.builder.Demo1;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 21:24
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Ofo的车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Ofo的座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
