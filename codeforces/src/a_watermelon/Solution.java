package a_watermelon;


/**
 * @author : akashdhar
 * @date : 13-04-2019
 * @time : 11:05 AM
 */

import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 2 ){
            System.out.println("No");
            return;
        }

        if(input % 2 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
