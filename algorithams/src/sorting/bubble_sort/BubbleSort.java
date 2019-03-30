package sorting.bubble_sort;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 07:15 PM
 */
public class BubbleSort {


    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 23, 43, 12, 32, 12, 11};
        int n = arr.length;
//        before sort
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

            }
        }
//        after sort
        System.out.println(Arrays.toString(arr));
    }


}
