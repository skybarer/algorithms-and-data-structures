package java_subarray;

/**
 * @author : akashdhar
 * @date : 21-03-2019
 * @time : 10:16 PM
 */

//  https://www.hackerrank.com/challenges/java-negative-subarray/problem
public class Solution {

    /*
    * how to store all sub arrays in which data type
    * */

    public static void main(String[] args) {

        int[] arr = {255, -77, 601, 89, -993, -307, 300, 452, -312, 400, -993, 831, 790, 236, 981, 274, 167, 676, -134, -906, 139, -537, -159, 483, 398, 253, 583, 348, 582, 481, 398, -504, 459, 39, 650, 424, 511, 581, 303, 142, -300, 796, 183, -609, 432, 33, -846, -101, 421, 602, -789, 214, 692, -971, 212, 752, -564, -747, -396, 217, 448, 364, -139, 304, -309, 337, 989, 751, 698, 381, 892, -774, 34, 557, 231, 612, -377, -677, 497, -781, -944, 608, 21, 967, 787, -334, 835, 136, 335, -4, -468, -301, -296, 65, -664, -303, 317, 893, 624, 115};
        int n = arr.length;
        int subArraySum = 0;
        int negativeSubArrayCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++){
                    subArraySum += arr[k];
//                    System.out.print(arr[i] + " ");
                }
                System.out.println();

                if (subArraySum < 0) negativeSubArrayCount++;
                subArraySum = 0;

            }
        }

        System.out.println(negativeSubArrayCount);


    }
}


