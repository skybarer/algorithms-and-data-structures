package arrays;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 02:12 PM
 */
public class OneDimensionalArray {

//    public static String printArray(int[] arr) {
//        if (arr == null) return "null";
//        int iMax = arr.length - 1;
//        if (iMax == -1)
//            return "[]";
//    }

    public static void main(String[] args) {

        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));

        int[] intArray = {1, 2, 3};
        System.out.println(Arrays.toString(intArray));

        for (int i : intArray) {
            System.out.print(i + " ");
        }


    }
}
