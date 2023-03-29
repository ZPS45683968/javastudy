package design_patternlearn.builder.Demo1;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 21:09
 */
public class Bike {
    private String frame;   //车架
    private String seat;    //座椅
    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    public String getFrame() {
        return frame;
    }

    public String getSeat() {
        return seat;
    }


}
