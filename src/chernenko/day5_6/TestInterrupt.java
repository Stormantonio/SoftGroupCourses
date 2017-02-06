package chernenko.day5_6;

/**
 * Created by java-2-03 on 06.02.2017.
 */
public class TestInterrupt {

    final public static void main(String[] args) throws InterruptedException {
        Thread cat = new Thread(new MyTread());
        cat.start();
        Thread.sleep(3000);
        cat.interrupt();
        cat.join();
    }

    static class MyTread implements Runnable {

        @Override
        public void run() {
            System.out.println("Начало выполнения потока");
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Сон начинается");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Сон прерван");
                    //Восстанавливаем статус прерывания потока
                    Thread.currentThread().interrupt();
                }
                System.out.println("Сон закончился\n");
            }
            System.out.println("Завершение работы потока");
        }

    }
}
