package chernenko.day5_6;

//import static java.lang.Thread.yield;

/**
 * Created by java-2-03 on 05.02.2017.
 */
public class MyThread1 extends Thread {

    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//        myThread1.start();
        Thread myThread2 = new Thread(new MyThread2());
        myThread2.setPriority(1);
        myThread2.start();

        Thread myThread3 = new Thread(new MyThread3());
        myThread2.setPriority(1);
        myThread3.start();

    }

}

class MyThread2 implements Runnable {

    @Override
    public void run() {
     while (true) {

         /*try {
             System.out.println("I'm first thread!");
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }*/
         System.out.println("Thread 1");
         Thread.yield();
     }
    }
}

class MyThread3 implements Runnable {

    @Override
    public void run() {
        /*while (true) {
            try {
                System.out.println("I'm second thread!");
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        System.out.println("Thread 2");
        Thread.yield();
    }
}
