package design_patternlearn.StructurePattern.decorator;

/**
 * @Author ps_zhao
 * @Description 快餐类（抽象构件角色）
 */
public abstract class FastFood {

    private float price;        //价格
    private String desc;        //描述
    public FastFood() {
    }
    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
