package threadlearn;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 12:33
 */
public class Thread02 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}

class T1 implements Runnable {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("T1------" + times);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            times++;
        }

    }
}
class T2 implements Runnable {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("T2-----" + times);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            times++;
            if (times == 10) {
                break;
            }
        }
    }
}
