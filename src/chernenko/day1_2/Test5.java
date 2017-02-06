package chernenko.day1_2;

import java.util.Arrays;

/**
 * Created by java-2-03 on 23.01.2017.
 */
public class Test5 {
    public static void main(String[] args) {

        int[] arr0 = {1,2,3,4,6,8};

        System.out.println(Arrays.binarySearch(arr0, 1));
        System.out.println(Arrays.binarySearch(arr0, 0));
        System.out.println(Arrays.binarySearch(arr0, 3));
        System.out.println(Arrays.binarySearch(arr0, 7));
    }
}
