package chernenko.day3_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class Test13 {
    public static void main(String[] args) {

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C://phpstorm_key.txt");

            System.out.println("Razmer v baytah - " + fin.available());

            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
