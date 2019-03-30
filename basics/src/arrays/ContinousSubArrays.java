package arrays;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 03:22 PM
 */
public class ContinousSubArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        System.out.println("Number of continuous sub arrays: " + (n * (n + 1)) / 2);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }


    }
}
