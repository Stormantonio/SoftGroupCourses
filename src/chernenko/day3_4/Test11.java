package chernenko.day3_4;

import java.sql.SQLException;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class Test11 {
    public static void main(String[] args) {
        try {
            System.out.println("In try");
            return;
        } catch (RuntimeException e)  {
            System.out.println("in catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("after");
    }
}
