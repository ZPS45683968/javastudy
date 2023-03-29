package design_patternlearn.builder.Demo1;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 21:25
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
