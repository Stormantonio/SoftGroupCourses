package chernenko.day3_4;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class Test14 {
    public static void main(String[] args) {
        try (FileInputStream fin1 = new FileInputStream("C://phpstorm_key.txt")) {
            System.out.println("Razmer v baytah - " + fin1.available());

            int i;
            while ((i = fin1.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
