package chernenko.day5_6.printThread;

/**
 * Created by java-2-03 on 06.02.2017.
 */
public class PrintService {

    public void print(String msg) {
        try {
            System.out.print("[" + msg);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
