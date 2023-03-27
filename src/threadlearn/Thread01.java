package threadlearn;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 10:27
 * 通过继承Thread类来创建线程
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start(); //启动线程
        Cat cat2 = new Cat();
        cat2.start();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("我是一只小狗" + " 线程名称：" + Thread.currentThread().getName());
        }
    }
}

//该类当做线程类使用
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {         //重写run方法，自己的线程要执行的任务

        while(true) {
            times++;
            System.out.println("我是一只小猫" + " 线程名称：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); //线程休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 100) {
                break;
            }
        }
    }
}