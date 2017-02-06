package chernenko.day5_6.storage;

/**
 * Created by java-2-03 on 05.02.2017.
 */
public class Storage {

    private int n;
    private boolean check = false;

    public synchronized int get() {
        while (!check) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
        System.out.println("Get - " + n);
        check = false;
        notify();
        return n;
    }

    public synchronized void put(int n) {
        while (check) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
        this.n = n;
        check = true;
        System.out.println("Put - " + n);
        notify();
    }
}

