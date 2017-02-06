package chernenko.day5_6.storage;

/**
 * Created by java-2-03 on 05.02.2017.
 */
public class Producer implements Runnable{
    private Storage storage;

    public Producer(Storage s) {
        this.storage = s;
        new Thread(this, "Producer").start();
    }


    @Override
    public void run() {
        int i = 0;
        while (true) {
            storage.put(i++);
        }
    }
}
