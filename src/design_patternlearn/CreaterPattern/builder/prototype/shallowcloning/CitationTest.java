package design_patternlearn.CreaterPattern.builder.prototype.shallowcloning;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 17:57
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citatiton = new Citation();
        Citation citatiton1 = citatiton.clone();

        citatiton.setName("张三");
        citatiton1.setName("李四");

        citatiton.display();
        citatiton1.display();
    }
}
