package design_patternlearn.StructurePattern.combination;

/**
 * @Author ps_zhao
 * @Description 菜单组件，抽象根结点
 */
public abstract class MenuComponent {

    //菜单组件名称
    protected String name;
    //菜单组件层级
    protected int level;

    //添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //删除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //获取子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    //获取菜单组件名称
    public String getName() {
        return name;
    }

    //获取菜单组件层级
    public int getLevel() {
        return level;
    }

    //打印菜单组件名称
    public abstract void print();

}
