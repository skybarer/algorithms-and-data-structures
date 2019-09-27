package arrays;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 25-05-2019
 * @time : 02:39 PM
 */
public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        /* reverse an array with auxiliary space */

        int[] arrAuxilary = new int[arr.length];
        // coping the elements from arr to arrAuxilary in reverse order
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arrAuxilary[j] = arr[i];
        }
        // coping elements back to original array
        for (int k = 0; k < arr.length; k++) {
            arr[k] = arrAuxilary[k];
        }

        //   System.arraycopy(arrAuxilary, 0, arr, 0, arr.length);
        // printing the elements tot the console
        System.out.println(Arrays.toString(arr));

    }
}
