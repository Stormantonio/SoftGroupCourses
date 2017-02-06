package chernenko.day5_6.shop;

import java.util.concurrent.CountDownLatch;

/**
 * Created by java-2-03 on 06.02.2017.
 */
public class Shop {
    private static final CountDownLatch START = new CountDownLatch(4);
    private static final int wayLength = 500000;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            new Thread(new Consumer(i, (int) (Math.random() * 100 + 20))).start();
            Thread.sleep(1000);
        }

        while (START.getCount() > 1) {
            Thread.sleep(100);
        }

        Thread.sleep(1000);
        System.out.println("Welcome!");
        START.countDown();
    }

    public static class Consumer implements Runnable {
        private int consumerNumber;
        private int whoFirstBought;

       /* public Consumer(int consumerNumber) {
            this.consumerNumber = consumerNumber;
        }*/

        public Consumer(int consumerNumber, int whoFirstBought) {
            this.consumerNumber = consumerNumber;
            this.whoFirstBought = whoFirstBought;
        }

        @Override
        public void run() {
            try {
                System.out.printf("Consumer N%d arrived to the shop!\n", consumerNumber);
                START.countDown();
                START.await();
                Thread.sleep(wayLength / whoFirstBought);
                System.out.printf("Consumer N%d bought some thing!\n", consumerNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
