package arrays;

import time.TimeCalculator;

/**
 * @author : akashdhar
 * @date : 14-04-2019
 * @time : 11:50 AM
 */
public class LargeArrays {

    /**
     * Some VMs reserve some header words in an array.
     * Attempts to allocate larger arrays may result in
     * OutOfMemoryError: Requested array size exceeds VM limit
     */
    private static final int MAX_ARRAY_SIZE = (int) Math.pow(10, 7);


    public static void main(String[] args) {
        TimeCalculator.startTime();
        int[] arr = new int[MAX_ARRAY_SIZE];

        System.out.println(arr[0]);
        TimeCalculator.endTime();
    }
}
