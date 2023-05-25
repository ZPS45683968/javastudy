package design_patternlearn.StructurePattern.flyweight;

/**
 * @Author ps_zhao
 * @Description 具体享元角色，IBox
 */
public class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "I";
    }
}
