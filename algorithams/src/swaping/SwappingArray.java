package swaping;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 07:29 PM
 */
public class SwappingArray {


    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {10, 12};
//        before swapping
        System.out.println(Arrays.toString(arr));

        swap(arr);
//        after swapping
        System.out.println(Arrays.toString(arr));
    }

}
