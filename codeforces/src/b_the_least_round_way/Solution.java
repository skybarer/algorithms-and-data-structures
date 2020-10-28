package b_the_least_round_way;

// https://stackoverflow.com/questions/32578487/how-will-i-solve-this-using-dp
// https://app.codility.com/demo/results/trainingAXFQ5B-SZQ/

import java.util.Scanner;

public class Solution {

    private static void minCostPathString(long[][] matrix, int rows, int cols) {
        String path = "";
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {

            }
        }
    }

    private static long minCostPath(long[][] matrix, int rows, int cols) {
        // Fullfill the first row
        for (int i = 1; i < rows; i++) {
            matrix[i][0] += matrix[i - 1][0];
        }

        // Fullfill the first column
        for (int i = 1; i < cols; i++) {
            matrix[0][i] += matrix[0][i - 1];
        }

        // for rest of the 2d matrix
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] += Math.min(matrix[i - 1][j], matrix[i][j - 1]);
            }
        }
        return matrix[rows - 1][cols - 1];
    }

    private static void printMatrix(long[][] matrix) {
        System.out.println();
        for (long[] longs : matrix) {
            for (long aLong : longs) {
                System.out.print(aLong + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] arrP2 = new long[n][n];
        long[][] arrP5 = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long ele = sc.nextLong();
//                arr[i][j] = ele;
                if (ele % 2 == 0)
                    arrP2[i][j] = ele / 2;
                else if (ele % 5 == 0)
                    arrP5[i][j] = ele / 5;
            }
        }

        printMatrix(arrP2);
        long min2PathValue = minCostPath(arrP2, n, n);
        printMatrix(arrP2);

        printMatrix(arrP5);
        long min5PathValue = minCostPath(arrP5, n, n);
        printMatrix(arrP5);

    }
}
