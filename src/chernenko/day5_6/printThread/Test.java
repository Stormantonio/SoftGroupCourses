package chernenko.day5_6.printThread;

/**
 * Created by java-2-03 on 06.02.2017.
 */
public class Test {

    public static void main(String[] args) {
        PrintService service = new PrintService();
        new PrintThread(service, "From thread1");
        new PrintThread(service, "From thread2");
        new PrintThread(service, "From thread3");
    }
}
