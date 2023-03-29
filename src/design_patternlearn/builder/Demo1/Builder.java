package design_patternlearn.builder.Demo1;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 21:16
 */
public abstract class Builder {
    protected Bike bike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
