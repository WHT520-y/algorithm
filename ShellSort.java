package wht.wyw.sortArithmetic;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 4, 2, 3, 6, 7, 8};
        int increment = arr.length - 1;
        do {
            increment = increment / 3 + 1;
            for (int i = increment; i < arr.length; i++) {
                if (arr[i - increment] > arr[i]) {
                    int temp = arr[i];
                    int j;
                    for (j = i - increment; j >= 0 && arr[j] > temp; j -= increment)
                        arr[j + increment] = arr[j];
                    arr[j + increment] = temp;
                }
            }
        } while (increment > 1);
        System.out.println(Arrays.toString(arr));
    }
}
