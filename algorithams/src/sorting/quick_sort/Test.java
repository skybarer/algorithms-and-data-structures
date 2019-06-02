package sorting.quick_sort;

import java.util.Arrays;

import static sorting.quick_sort.QuickSort.quickSort;

/**
 * @author : akashdhar
 * @date : 24-03-2019
 * @time : 11:00 AM
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 5, 3, 4, 8, 0, 1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
