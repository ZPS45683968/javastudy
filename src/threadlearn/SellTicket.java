package threadlearn;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 13:04
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();    //start() will call run()
//        sellTicket02.start();   //start() will call run()
//        sellTicket03.start();   //start() will call run()
//            SellTicket02 sellTicket02 = new SellTicket02();
//            Thread thread01 = new Thread(sellTicket02);
//            Thread thread02 = new Thread(sellTicket02);
//            Thread thread03 = new Thread(sellTicket02);
//            thread01.start();
//            thread02.start();
//            thread03.start();
        SellTicket03 sellTicket03 = new SellTicket03();
        Thread thread01 = new Thread(sellTicket03);
        Thread thread02 = new Thread(sellTicket03);
        Thread thread03 = new Thread(sellTicket03);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}

//use thread

class SellTicket01 extends Thread{
    private static int ticket = 100;        //multiple threads share the same data
    @Override
    public void run() {
        while (true){
            if (ticket <= 0){
                System.out.println("Sold out");
                break;
            }
            try{
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余 " + --ticket);
        }
    }
}

//use runnable,use synchronized to avoid the problem of thread safety
class SellTicket02 implements Runnable{
    private static int ticket = 100;        //multiple threads share the same data
    @Override
    public void run() {
        while (true){
            if (ticket <= 0){
                System.out.println("Sold out");
                break;
            }
            try{
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余 " + --ticket);
        }
    }
}

//use runnable,use synchronized to avoid the problem of thread safety
class SellTicket03 implements Runnable{
    private static int ticket = 1000;        //multiple threads share the same data
    private boolean flag = true;
    public synchronized void sell(){    //in this way, only one thread can access the method at a time
        if (ticket <= 0){
            System.out.println("Sold out");
            flag = false;
            return;
        }
        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余 " + --ticket);
    }

    @Override
    public void run() {
        while (flag){
            sell();
        }
    }
}