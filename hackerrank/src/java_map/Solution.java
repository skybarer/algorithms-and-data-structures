package java_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 22-03-2019
 * @time : 12:42 AM
 */
public class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            String name = "";
            while (in.hasNext()) {
                name = in.next() + " ";
            }

            String phone = in.nextLine();
            System.out.println(name);
            System.out.println(phone);

        }
        while (in.hasNext()) {
            String s = in.nextLine();
        }


    }
}
