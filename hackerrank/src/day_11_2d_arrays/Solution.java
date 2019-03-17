package day_11_2d_arrays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-2d-arrays/problem

public class Solution {

//            3 7-3 0 1 8
//            1-4-7-8-6 5
//            -8 1 3 3 5 7
//            -2 4 3 1 2 7
//            2 4-5 1 8 4
//            5-7 6 5 2 8



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int sum = -10000;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                // [00] [01] [02]
                //      [11]
                // [20] [21] [22]

                int currentSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (currentSum > sum) {
                    sum = currentSum;
                }
            }
        }

        System.out.println(sum);
    }
}
