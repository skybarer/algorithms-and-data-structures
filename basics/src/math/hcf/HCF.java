package math.hcf;

import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 13-04-2019
 * @time : 11:35 AM
 */
public class HCF {

    public static int findHCF(int a, int b) {
        int hcf = 1;
        for (int i = 2; i < Math.sqrt(Math.max(a, b)); i++)
            if (a % i == 0 && b % i == 0) hcf = i;
        return hcf;
    }

    // finding the hcf of two numbers
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findHCF(a, b));
    }


}
