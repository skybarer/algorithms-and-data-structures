package math.prime_numbers;

import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 11-04-2019
 * @time : 08:20 PM
 */
public class PrimeFactors {

    public static void printAllPrimeFactors(int n) {

        // Print the number of 2s that divide n 
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }

    // take a input and list all prime factors a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // prints all prime factors.
        printAllPrimeFactors(number);
    }
}
