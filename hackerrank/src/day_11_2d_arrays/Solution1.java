package day_11_2d_arrays;

// https://www.hackerrank.com/challenges/30-2d-arrays/problem

public class Solution1 {


    public static void main(String[] args) {
        int[][] arr = {
                {3, 7, -3, 0, 1, 8},
                {1, -4, -7, -8, -6, 5},
                {-8, 1, 3, 3, 5, 7},
                {-2, 4, 3, 1, 2, 7},
                {2, 4, -5, 1, 8, 4},
                {5, -7, 6, 5, 2, 8}
        };

        int maxSum = -1000;
        int arraySum = 0;

        int l = 1;
        for (int k = 0; k < 4; k++) {
            for (int i = k; i < 3 + k; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((("" + i + j).equals(String.valueOf(10 * l))) || (("" + i + j).equals(String.valueOf((10 * l) + 2)))) {
                    } else {
                        arraySum += arr[i][j];
                    }
                }
            }
            l = l + 1;
            if (maxSum < arraySum) maxSum = arraySum;
            System.out.println(arraySum);
            arraySum = 0;
        }

        l = 0;
        for (int k = 0; k < 4; k++) {
            for (int i = k; i < 3 + k; i++) {
                for (int j = 1; j < 4; j++) {
                    if ((("" + i + j).equals(String.valueOf(11 * l))) || (("" + i + j).equals(String.valueOf((11 * l) + 2)))) {
                    } else {
                        arraySum += arr[i][j];
                    }
                }
            }
            l = l + 1;
            if (maxSum < arraySum) maxSum = arraySum;
            System.out.println(arraySum);
            arraySum = 0;
        }

        l = 0;
        for (int k = 0; k < 4; k++) {
            for (int i = k; i < 3 + k; i++) {
                for (int j = 2; j < 5; j++) {
                    if ((("" + i + j).equals(String.valueOf(12 * l))) || (("" + i + j).equals(String.valueOf((12 * l) + 2)))) {
                    } else {
                        arraySum += arr[i][j];
                    }
                }
            }
            l = l + 1;
            if (maxSum < arraySum) maxSum = arraySum;
            System.out.println(arraySum);
            arraySum = 0;
        }

        for (int k = 0; k < 4; k++) {
            for (int i = k; i < 3 + k; i++) {
                for (int j = 3; j < 6; j++) {
                    if ((("" + i + j).equals(String.valueOf(12 * l))) || (("" + i + j).equals(String.valueOf((12 * l) + 2)))) {
                    } else {
                        arraySum += arr[i][j];
                    }
                }
            }
            l = l + 1;
            if (maxSum < arraySum) maxSum = arraySum;
            System.out.println(arraySum);
            arraySum = 0;
        }

//        System.out.print(maxSum);

    }
}

