package math.prime_numbers;

import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 11:39 PM
 */

// https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax

public class PrimeNumber {

    //    checks a number is prime or not and returns a boolean
    public static boolean isPrime(int number) {
        boolean isPrimeOrNot = true;

        if (number <= 1) {
            return isPrimeOrNot = false;
        }

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                isPrimeOrNot = false;
                break;
            }
        }
        return isPrimeOrNot;
    }

    public static void main(String[] args) {
        // how to use do while in java to repeater call the do block ?
        do {
            Scanner sc = new Scanner(System.in);
            // what happens if scanned input is greater that the integer max size.
            int number = sc.nextInt(); // java.util.InputMismatchException: For input string: "4213431243124312"
            System.out.printf("%d is prime or not: %b\n", number, isPrime(number));
        } while (true);


    }
}
