package sorting.quick_sort;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 24-03-2019
 * @time : 10:59 AM
 */

 /*
 * Time-Complexity:
 *  1. worst-case : O( n^2)
 *  2. average-case: O(n log n)
 *  worst case can be avoided using randomised version of quick sort
 */
public class QuickSort {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int partitionIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, end);
        return partitionIndex;
    }


    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);

        }
    }

}
