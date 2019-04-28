package array_left_rotation;

/**
 * @author : akashdhar
 * @date : 14-04-2019
 * @time : 08:50 AM
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void rotateLeft(int[] a, int d) {

        int[] r = new int[d];

        // copy the elements that need to be rotated.
        for (int i = 0; i < d; i++) {
            r[i] = a[i];
        }

        // shift the elements
        for (int i = 0; i < a.length - d; i++) {
            a[i] = a[i + d];
        }

        //copy the elements from the rotate array
        for (int i = 0; i < d; i++) {
            a[a.length - d + i] = r[i];
        }

        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        rotateLeft(a, d);


        scanner.close();
    }
}

