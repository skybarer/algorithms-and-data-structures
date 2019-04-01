package day_29_bitwise_and;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 01:30 PM
 */

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int max = 0;
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);


            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int current = i & j;
                    if (current < k && current > max && (i< j)) {
                        max = current;
                    }
                }

            }
            System.out.println(max);
            max =0;
        }


    }
}


