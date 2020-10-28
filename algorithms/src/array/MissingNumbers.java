package array;

/**
 * @author : akashdhar
 * @date : 02-06-2019
 * @time : 12:04 PM
 * @question: 1. How to find the single missing element in a sorted array
 */
public class MissingNumbers {

    public static int findMissingNumbers(int[] array) {

        int sum = 0;
        int n = array[array.length - 1];
        int actualSum = n * (n + 1) / 2;

        for (int ele : array) sum += ele;
        return actualSum - sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        System.out.println(findMissingNumbers(arr));

    }
}
