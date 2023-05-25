package design_patternlearn.StructurePattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ps_zhao
 * @Description 菜单类，树枝结点
 */
public class Menu extends MenuComponent {

    protected List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }
    @Override
    public void print() {
        System.out.println("菜单名称：" + name);
        for (MenuComponent menuComponent : menuComponentList) {
            if (level != 0) {
                for (int i = 0; i < level; i++) {
                    System.out.print("  ");
                }
                for (int i = 0; i < level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            menuComponent.print();
        }
    }
}
