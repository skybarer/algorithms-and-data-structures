package array_manipulation;

/**
 * @author : akashdhar
 * @date : 14-04-2019
 * @time : 09:16 AM
 */

// https://www.hackerrank.com/challenges/crush/problem

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        // initialize array with 0's of size n
        long arr[] = new long[n];

        // each successive element contains the difference between itself and previous element

        for (int i = 0; i < queries.length; i++) {
        // when checking query, subtract 1 from both a and b since 0 indexed array
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];

            arr[a] += k;
            if (b + 1 < n) {
                arr[b + 1] -= k;
            }
        }

        // track highest val seen so far as we go
        long max = Long.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            max = Math.max(arr[i], max);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }


        long result = arrayManipulation(n, queries);

        System.out.println(String.valueOf(result));


        scanner.close();
    }
}



