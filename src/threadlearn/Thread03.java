package threadlearn;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 13:54
 */
public class Thread03 {
    public static void main(String[] args) {
        MyDaemonThread myDaemonThread = new MyDaemonThread();


        //if the main thread is over, the daemon thread will be over too.
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i =1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " is running");
        }
    }
}
