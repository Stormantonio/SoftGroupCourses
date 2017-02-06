package chernenko.day1_2;

/**
 * Created by java-2-03 on 22.01.2017.
 */
public class Test2 {
    public static void main(String[] args) {

        String str = new String("str");
        String str1 = "str";
        System.out.println(str == str1);
        String str2 = "str";
        System.out.println(str1 == str2);


        str=str.intern();

        System.out.println(str == str1);


    }
}
