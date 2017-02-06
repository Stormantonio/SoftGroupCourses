package chernenko.day3_4;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class Test16 {
    public static void main(String[] args) {

        String text = "Hello world!"; // stroka dlya zapisi
        try (FileOutputStream out = new FileOutputStream("C://test//hello1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // perevod stroki v baytu
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
