package chernenko.day3_4;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class Test9 {
    public static void main(String[] args) {
        try {
            System.out.println("In try");
            System.exit(0);
        } catch (RuntimeException e)  {

        } finally {
            System.out.println("finally");
        }
        System.out.println("after");
    }
}
