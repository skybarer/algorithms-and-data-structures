package leonardo_and_prime;

import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 11-04-2019
 * @time : 07:59 PM
 */

// https://www.hackerrank.com/challenges/leonardo-and-prime/problem
public class Solution {


    static int primeCount(long n) {

        long primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        int count = 0;
        long pf = primes[0];
        for (int j = 1; j < primes.length && pf <= n && n != 1; j++) {
            pf = pf * primes[j];
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());
            int result = primeCount(n);
            System.out.println(result);
        }
    }
}
