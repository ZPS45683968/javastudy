package design_patternlearn.SingleTon;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 10:41
 */
public class SingleTon {
    public static void main(String[] args) {

    }
}

// 饿汉式（静态变量）
class Singleton001 {
    private Singleton001() {
    }
    private final static Singleton001 instance = new Singleton001();

    public static Singleton001 getInstance() {
        return instance;
    }
}

// 饿汉式（静态代码块）
class Singleton002 {
    private Singleton002() {     // 构造器私有化，外部不能new
    }
    private final static Singleton002 instance;

    // 在静态代码块中，创建单例对象
    static {
        instance = new Singleton002();
    }

    public static Singleton002 getInstance() {
        return instance;
    }
}