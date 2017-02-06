package chernenko.day1_2;

import java.util.Arrays;

/**
 * Created by java-2-03 on 23.01.2017.
 */
public class Test6 {


    public static int[] merge(int[] arr0, int[] arr1) {

        int[] result = new int[arr1.length + arr0.length];

        System.out.println("arr0 - " + Arrays.toString(arr0));
        System.out.println("arr1 - " + Arrays.toString(arr1));

        int index0 = 0;
        int index1 = 0;

        while (index0 + index1 != result.length - 2) {
            if (index0 < arr0.length && index1 < arr1.length) {
                if (arr0[index0] <= arr1[index1]) {
                    result[index0 + index1] = arr0[index0++];
                } else {
                    result[index0 + index1] = arr1[index1++];
                }
            } else if (index0 == arr0.length) {
                index0 = arr0.length - 1;
                System.arraycopy(arr1, index1, result, index1 + index0 + 1, arr1.length - index1);
                index1 = arr1.length - 1;
            } else if (index1 == arr1.length) {
                index1 = arr1.length - 1;
                System.arraycopy(arr0, index0, result, index1 + index0 + 1, arr0.length - index0);
               index0 = arr0.length - 1;
            }
            System.out.println("---" + Arrays.toString(result));
        }
        return result;
    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        int[] arr1 = {1, 2, 5};
        int[] arr0 = {2, 4, 5};
        System.out.println(Arrays.toString(Test6.merge(arr0, arr1)));
    }
}
