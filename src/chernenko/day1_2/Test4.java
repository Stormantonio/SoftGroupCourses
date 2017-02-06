package chernenko.day1_2;

import java.util.Arrays;

/**
 * Created by java-2-03 on 23.01.2017.
 */
public class Test4 {
    public static void main(String[] args) {

        int[] arr0 = {1, 2, 3, 4, 5};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0};

        System.out.println(arr0);
        System.out.println(Arrays.toString(arr0));
        System.out.println(Arrays.toString(arr1));
        System.arraycopy(arr0, 2, arr1, 4, 3);
        System.out.println(Arrays.toString(arr1));
        System.arraycopy(arr0, 0, arr0, 2, 2);
        System.out.println(Arrays.toString(arr0));


        int[] arr2 = {2, 3, 6, 0, 0, 0, 6, 7, 9, 1};
        System.arraycopy(arr2, 0, arr2, 7, 3);
        System.out.println(Arrays.toString(arr2));

    }
}
