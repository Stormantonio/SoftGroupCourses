package chernenko.day3_4;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class Test12 {
    private static void process() {
        // create an exception
        NullPointerException e = new NullPointerException("high level");
        // add cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            process();
        } catch (NullPointerException e) {
            // otobrazit' isklyuchenie verhnego urovnyz
            System.out.println("Perehvacheno: " + e);
            // otobrazit' isklyuchenie-prichinu
            System.out.println("Ishodnaya prichina: " + e.getCause());
        }
    }
}
