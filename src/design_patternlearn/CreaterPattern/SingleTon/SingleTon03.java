package design_patternlearn.CreaterPattern.SingleTon;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 14:09
 */
public class SingleTon03 {
    public static void main(String[] args) {

    }
}
// 双重检查
/*
   1. 双重检查的方式，解决了线程安全问题，同时也解决了效率问题
   2. 也解决了懒加载问题
   2. 这种方式，实际开发中，推荐使用
 */
class SingleTon03_1 {
    private static volatile SingleTon03_1 instance;         // volatile关键字，使改变的值立即刷新到主内存中，保证可见性

    private SingleTon03_1() {
    }

    public static SingleTon03_1 getInstance() {
        if (instance == null) {
            synchronized (SingleTon03_1.class) {
                if (instance == null) {
                    instance = new SingleTon03_1();
                }
            }
        }
        return instance;
    }
}