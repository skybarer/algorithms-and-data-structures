package array;

/**
 * @author : akashdhar
 * @date : 16-06-2019
 * @time : 10:35 AM
 */
public class LonelyInteger {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 3, 0, 1, 5};

        int output = 0;

        for (int i : arr) {
            output ^= i;
        }

        System.out.println(output);
    }
}
