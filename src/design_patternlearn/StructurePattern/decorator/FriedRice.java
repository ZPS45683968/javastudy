package design_patternlearn.StructurePattern.decorator;

/**
 * @Author ps_zhao
 * @Description 炒饭（具体构件角色）
 */
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
