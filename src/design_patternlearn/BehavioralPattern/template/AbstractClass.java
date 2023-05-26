package design_patternlearn.BehavioralPattern.template;

/**
 * @Author ps_zhao
 * @Description 抽象类(模板方法模式)
 */
public abstract class AbstractClass {
    //模板方法，用来控制炒菜的流程
    public final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.heatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }
    public void pourOil() {
        System.out.println("倒油");
    }
    //内容一样的直接实现，内容不一样的交给子类实现，这就是模板方法模式
    public void heatOil() {
        System.out.println("热油");
    }

    // 蔬菜不一样，交给子类实现
    public abstract void pourVegetable();

    // 调料不一样，交给子类实现
    public abstract void pourSauce();

    // 炒菜一样，直接实现
    public void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
