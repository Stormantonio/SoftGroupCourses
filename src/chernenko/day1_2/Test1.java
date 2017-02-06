package chernenko.day1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by java-2-03 on 22.01.2017.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        int a = 200;
        byte b = (byte)a;
        System.out.println(b);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(reader.readLine());
        String[] seasons = {"Summer", "Autumn", "Winter", "Spring"};
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(seasons[2]);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(seasons[3]);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(seasons[0]);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(seasons[1]);
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
