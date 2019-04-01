package math.integers;

import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 12:08 AM
 */
public class PositiveIntegers {

    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt(); // Exception in thread "main" java.util.InputMismatchException

            for (int i = 1; i <= number; i++)
                System.out.printf("%d ", i);
            System.out.println();

        } while (true);
    }
}
