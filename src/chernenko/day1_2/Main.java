package chernenko.day1_2;

/**
 * Created by java-2-03 on 22.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = a++;
        int c = 4;
        int d = c--;
        System.out.println(a + " " + b);
        System.out.println(c + " " + d);
    }
}
