package java_1d_array_part_2;

/**
 * @author : akashdhar
 * @date : 22-03-2019
 * @time : 12:02 AM
 */
// https://www.hackerrank.com/challenges/java-1d-array/problem
import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        int n = game.length;

        for (int i = 0; i < n; i++) {

            // move backward
              if (i > 0 && i - 1 == 0) {
                  i = i - 1;
              }

            if (i == n - 1 || i + leap >= n) {
                // move forward
                if (i + 1 < n && game[i + 1] == 0) i++;

            } else if (i + leap < n && game[i + leap] == 0) {
                i += leap;

                if (i == n - 1) return true;
            }


        }


        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}


