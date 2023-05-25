package design_patternlearn.StructurePattern.flyweight;

import java.util.HashMap;

/**
 * @Author ps_zhao
 * @Description 享元工厂角色，用于创建并管理享元对象，单例模式
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;
    private static BoxFactory factory = new BoxFactory();
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());
    }
    //提供一个方法获取工厂类
    public static BoxFactory getInstance() {
        return factory;
    }
    // 根据名称获取图形
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
