package design_patternlearn.CreaterPattern.builder.SingleTon;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 13:56
 */
public class SingleTon02 {
    public static void main(String[] args) {

    }
}

// 静态内部类
/*
    1. 这种方式，采用了类装载的机制来保证初始化实例时只有一个线程
    2. 静态内部类方式在SingleTon02_1类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingleTon02_1Holder类，从而完成SingleTon02_1的实例化
    3. 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的
    4. 优点：避免了线程不安全，延迟加载，效率高
    5. 结论：推荐使用
 */
class SingleTon02_1 {
    private static class SingleTon02_1Holder {
        private static final SingleTon02_1 INSTANCE = new SingleTon02_1();
    }

    private SingleTon02_1() {
    }

    public static SingleTon02_1 getInstance() {
        return SingleTon02_1Holder.INSTANCE;
    }
}