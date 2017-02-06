package chernenko.day1_2;

/**
 * Created by java-2-03 on 22.01.2017.
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1, 11, 6, 2, 8, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    int b = arr[j + 1];
                    int temp = arr[j];
                    arr[j] = b;
                    arr[j + 1] = temp;
                }

            }
        }
    }
}
