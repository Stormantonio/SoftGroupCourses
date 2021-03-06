package chernenko.day5_6.printThread;

/**
 * Created by java-2-03 on 06.02.2017.
 */
public class PrintThread implements Runnable {

    private PrintService service;
    private String msg;
    private Thread t;

    public PrintThread(PrintService service, String msg) {
        this.service = service;
        this.msg = msg;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (service) {
        service.print(msg);
        }
    }
}
