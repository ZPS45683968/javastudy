package design_patternlearn.StructurePattern.flyweight;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox box1 = boxFactory.getShape("I");
        box1.display("红色");

        AbstractBox box2 = boxFactory.getShape("L");
        box1.display("红色");

        AbstractBox box3 = boxFactory.getShape("O");
        box1.display("红色");

        AbstractBox box4 = boxFactory.getShape("I");
        box1.display("红色");
    }
}
