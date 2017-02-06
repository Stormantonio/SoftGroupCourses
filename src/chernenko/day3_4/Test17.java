package chernenko.day3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class Test17 {
    public static void main(String[] args) {

    }
    public String readLine() {
        String line = "";
        try {
            InputStream in = System.in;
            InputStreamReader charsIn = new InputStreamReader(in); // baity v simvoly
            //InputStreamReader carsIn1 = new InputStreamReader(in, "UTF-8");
            BufferedReader bufferedCharsIn = new BufferedReader(charsIn);
            System.out.println("Input Line");
            line = bufferedCharsIn.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
