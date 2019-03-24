package sorting.merge_sort;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 24-03-2019
 * @time : 08:51 AM
 */

//Merge Sort is the fastest stable sorting algorithm with worst-case complexity of O(nlogn), but it requires extra space.

public class MergeSort {

    private static void merge(int[] arr, int[] left, int[] right) {
        int nl = left.length;
        int nr = right.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nl && j < nr) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < nl) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nr) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] arr) {
        int na = arr.length;
        if (na < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, na);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

}
