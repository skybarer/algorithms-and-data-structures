package java_md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 12:51 PM
 */

// xhttps://www.hackerrank.com/challenges/java-md5/problem
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            // return bytesToHex(md.digest
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
