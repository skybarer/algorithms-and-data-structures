package mathematics.is_fibo;

/**
 * @author : akashdhar
 * @date : 13-04-2019
 * @time : 12:27 PM
 */

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    static boolean isPerfectSquare(long x) {
        long s = (long) Math.sqrt(x);
        return (s * s == x);
    }

    // Returns true if n is a Fibinacci Number, else false
    static boolean isFibonacci(long n) {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5 * n * n + 4) ||
                isPerfectSquare(5 * n * n - 4);
    }

    // Complete the solve function below.
    static String solve(long n) {
        if (isFibonacci(n)) return "IsFibo";
        return "IsNotFibo";
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = solve(n);

            System.out.println(result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }


}

