package chernenko.day5_6.storage;

/**
 * Created by java-2-03 on 05.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        Storage storage = new Storage();

        new Producer(storage);
        new Consumer(storage);
    }
}
