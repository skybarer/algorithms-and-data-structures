package a_theatre_square;


/**
 * @author : akashdhar
 * @date : 13-04-2019
 * @time : 11:19 AM
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long a = scanner.nextInt();

        long x, y = 1;

        if (n % a == 0) x = (n / a);
        else x = (n / a) + 1;

        if (m % a == 0) y = (m / a);
        else y = (m / a) + 1;
        System.out.println(x * y);
    }
}
