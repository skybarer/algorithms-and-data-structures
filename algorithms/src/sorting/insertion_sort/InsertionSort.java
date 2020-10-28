package sorting.insertion_sort;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 25-05-2019
 * @time : 11:47 PM
 */
public class InsertionSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 23, 43, 12, 32, 12, 11};
        int n = arr.length;
//        before sort
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            // insert arr[i] in sortred sequence
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
                arr[j+1] = key;
            }
        }
//        after sort
        System.out.println(Arrays.toString(arr));
    }

}
