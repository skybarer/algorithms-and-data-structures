package arrays;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 07-04-2019
 * @time : 12:04 PM
 */
public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] temp = new int[d];
        int n = a.length;

        // get elements that need to be rotated
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }

        // shift the elements from last to front
        for (int j = 0; j < n; j++) {
            if ((j + d) < n) a[j] = a[j + d];
        }

        //add elements to the a array at the end.
        for (int k = 0; k < n; k++) {
            if ((n - d + k) < n) a[n - d + k] = temp[k];
        }
        return a;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        int[] arr = rotLeft(a, 2);
        System.out.println(Arrays.toString(arr));

    }
}
