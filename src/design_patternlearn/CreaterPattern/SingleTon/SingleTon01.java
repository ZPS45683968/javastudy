package design_patternlearn.CreaterPattern.SingleTon;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 13:41
 */
public class SingleTon01 {
    public static void main(String[] args) {

    }
}

// 线程不安全懒汉式
/*
    1. 这种方式，本意是想实现懒加载，但不是线程安全的，如果多个线程同时进入if (instance == null)这个判断，就会创建多个实例
    2. 也就是说，这种方式，实际上是线程不安全的
    3. 实际开发中，不要使用这种方式
 */
class SingleTon01_1 {
    private static SingleTon01_1 instance;

    private SingleTon01_1() {
    }

    public static SingleTon01_1 getInstance() {
        if (instance == null) {
            instance = new SingleTon01_1();
        }
        return instance;
    }
}

// 线程安全懒汉式
/*
    1. 为了解决线程不安全的问题，我们可以在方法上加上synchronized关键字，但是这样做效率太低了
    2. 其实这个方法只需要执行一次就够了，后面的线程进来就不需要再执行了，后面的线程进来就直接返回就行了
    3. 实际开发中，我们不推荐使用这种方式
 */
class SingleTon01_2 {
    private static SingleTon01_2 instance;

    private SingleTon01_2() {
    }

    public static synchronized SingleTon01_2 getInstance() {
        if (instance == null) {
            instance = new SingleTon01_2();
        }
        return instance;
    }
}

