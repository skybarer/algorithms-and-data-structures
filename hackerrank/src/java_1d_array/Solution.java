package java_1d_array;

import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 01-05-2019
 * @time : 08:43 PM
 */
public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        int i = 0;

        // first try to i+leap == 0
        // try to i+1 = 0
        // back i -1 = 0



        while (i < n) {

            if (i + leap <= n - 1 && game[i + leap] == 0 && leap != 0) i = i + leap;
            else if (i + 1 <= n - 1 && game[i + 1] == 0) i = i + 1;
            else if (i - 1 >= 0 && game[i - 1] == 0) i = i - 1;
            else return false;
            game[i] = 1;
            if (i == n - 1 || i + leap >= n) return true;
        }
        return true;
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
