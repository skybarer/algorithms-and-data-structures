package arrays;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 07-04-2019
 * @time : 12:23 PM
 */
public class MinimumSwaps2 {

    //swap two elements in a array
    static void swapArrayElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int minimumSwaps = 0;
        int n = arr.length;

        // merge sort technique for swapping
        int mid = n / 2;
        int pivot = arr[mid];


        return (int) (Math.log(n));
    }

    public static void main(String[] args) {

//        int[] a = {1, 3, 5, 2, 4, 6, 7};
        int[] a = {4, 3, 1, 2};
        System.out.println(Arrays.toString(a));
        System.out.println("minimum no of sways required to sort : " + minimumSwaps(a));
        System.out.println(Arrays.toString(a));
    }
}
