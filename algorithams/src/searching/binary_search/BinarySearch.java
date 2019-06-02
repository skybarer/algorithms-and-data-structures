package searching.binary_search;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 03:54 PM
 */

/*
*  precondition: should be sorted
*  Time-complexity: O(log n)
*/
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.sort(arr);
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.findElement(arr, 0, arr.length - 1, 6));
        System.out.println(binarySearch.findElementIterative(arr, 0, arr.length - 1, 4));
    }

    /*recursive approach*/
    private boolean findElement(int[] arr, int start, int end, int k) {
        int mid = (start + end) / 2;
        if (end < start) return false;
        if (k == arr[mid]) return true;
        if (k < arr[mid])
            return findElement(arr, start, mid - 1, k);
        else
            return findElement(arr, mid + 1, end, k);
    }

    /*iterative approach*/
    private boolean findElementIterative(int[] arr, int start, int end, int k) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (k == arr[mid]) return true;
            if (k < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }

}
