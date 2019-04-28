package array_manipulation;

/**
 * @author : akashdhar
 * @date : 14-04-2019
 * @time : 09:16 AM
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long[] arr = new long[n];
        for (int i = 0; i < queries.length; i++) {
            for (int k = queries[i][0] - 1; k < queries[i][1]; k++) {
                arr[k] += queries[i][2];
            }
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

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
        TimeCalculator.startTime();
        long result = arrayManipulation(n, queries);
        TimeCalculator.endTime();
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();

    }
}

class TimeCalculator {
    static long startTime = 0;
    static long endTime = 0;

    public static void startTime() {
        startTime = System.nanoTime();
    }

    public static void endTime() {
        endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total Time: " + totalTime / 1_000_000_000.0 + " sec");
    }
}

