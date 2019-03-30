package searching;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 03:54 PM
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.sort(arr);
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.findElement(arr, 0, arr.length-1, 6));
    }

    private boolean findElement(int[] arr, int start, int end, int k) {
        int mid = (start + end) / 2;
        if (end < start) return false;
        if (k == arr[mid]) return true;
        if (k < arr[mid])
            return findElement(arr, start, mid - 1, k);
        else
            return findElement(arr, mid + 1, end, k);

    }

}
