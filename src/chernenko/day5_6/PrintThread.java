package chernenko.day5_6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by java-2-03 on 05.02.2017.
 */
public class PrintThread extends Thread {

    private String message;

    public PrintThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message + " - " + i);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PrintThread printThread = new PrintThread("print");
        printThread.setDaemon(true);
        printThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main method");
            sleep(1000);
        }
//        printThread.join();
        System.out.println("finish main");
    }
}
