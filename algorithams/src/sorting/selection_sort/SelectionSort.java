package sorting.selection_sort;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 25-05-2019
 * @time : 11:49 PM
 */
public class SelectionSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;
        int min = 0;

        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 5, 3, 4, 8, 0, 1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
