package chernenko.day3_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class Test15 {
    public static void main(String[] args) {
        try (FileInputStream fin3 = new FileInputStream("C://phpstorm_key.txt");
             FileOutputStream fos = new FileOutputStream("C://phpstorm_key1.txt")) {
            byte[] buffer = new byte[fin3.available()];
            // schityvaem bufer
            fin3.read(buffer, 0, buffer.length);
            // zapisyvaem iz bufera v fail
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
