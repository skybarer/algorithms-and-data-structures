package arrays;

import java.math.BigInteger;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 08:25 AM
 */
public class SubSequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int subArrays = (int) Math.pow(2, n);
        System.out.println("Number of sub arrays: " + (subArrays-1));

        for (int counter = 1; counter < subArrays; counter++) {
            for (int j = 0; j < n; j++) {
                /* Check if jth bit in the counter is set
                    If set then print jth element from arr[] */
                if (BigInteger.valueOf(counter).testBit(j))
                    System.out.print(arr[j] + " ");
            }
            System.out.println();
        }


    }
}
