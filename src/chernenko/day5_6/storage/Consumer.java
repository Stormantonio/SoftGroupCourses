package chernenko.day5_6.storage;

/**
 * Created by java-2-03 on 05.02.2017.
 */
public class Consumer implements Runnable {

    private Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            storage.get();
        }
    }

}

