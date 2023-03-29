package design_patternlearn.SingleTon;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 14:11
 */
public class SingleTon04 {
    public static void main(String[] args) {
        SingleTon04_1 s1 = SingleTon04_1.INSTANCE;
        SingleTon04_1 s2 = SingleTon04_1.INSTANCE;
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

// 枚举
/*
    1. 枚举本身就是单例模式，能避免多线程同步问题
    2. 枚举可以防止反序列化,创建多个对象
 */
enum SingleTon04_1 {
    INSTANCE;
    public void sayOK() {
        System.out.println("ok");
    }
}
