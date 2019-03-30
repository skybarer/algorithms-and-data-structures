package java_md5;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 01:13 PM
 */

import java.util.Scanner;

class MD5 {

    private int[] s = {
            7, 12, 17, 22, 7, 12, 17, 22, 7, 12, 17, 22, 7, 12, 17, 22,
            5, 9, 14, 20, 5, 9, 14, 20, 5, 9, 14, 20, 5, 9, 14, 20,
            4, 11, 16, 23, 4, 11, 16, 23, 4, 11, 16, 23, 4, 11, 16, 23,
            6, 10, 15, 21, 6, 10, 15, 21, 6, 10, 15, 21, 6, 10, 15, 21
    };
    private long[] K = new long[64];

    public MD5() {
        for (int i = 0; i < 64; i++) {
            K[i] = (long) (Math.pow(2L, 32) * Math.abs(Math.sin(i + 1)));
        }
    }

    private long leftRotate(long F, int s) {
        long result = (F << s) & ((long) Math.pow(2, 32) - 1);
        result += (F >>> 32 - s);
        return result;
    }

    public long[] encrypt(String msg) {
        long a0 = 0x67452301;   //A
        long b0 = 0xefcdab89;   //B
        long c0 = 0x98badcfe;   //C
        long d0 = 0x10325476;   //D
        long modulus = (long) Math.pow(2L, 32);
        int mlen = msg.length() * 8;
        int paddingBytes = (448 - mlen % 512) / 8;
        if (paddingBytes == 0) paddingBytes = 64;
        String padmsg = msg + (char) 128;
        for (int i = 1; i < paddingBytes; i++) padmsg = padmsg + '\0';
        long padmlen = mlen;// can't deal with mlen >2^64
        long temp = padmlen;
        for (int i = 0; i < 8; i++) {
            padmsg = padmsg + (char) (temp & 0xff);
            temp = temp >>> 8;
        }
        int padmsgLen = mlen + 8 * paddingBytes + 64;
        int chunks = padmsgLen / 512;
        int start = 0;
        long[] M = new long[16];
        while (chunks > 0) {
            for (int i = 0; i < 16; i++) {
                M[i] = ((long) padmsg.charAt(start + 4 * i));
                M[i] += ((long) padmsg.charAt(start + 4 * i + 1)) << 8;
                M[i] += ((long) padmsg.charAt(start + 4 * i + 2)) << 16;
                M[i] += ((long) padmsg.charAt(start + 4 * i + 3)) << 24;
            }
            long A = a0;
            long B = b0;
            long C = c0;
            long D = d0;
            for (int i = 0; i < 64; i++) {
                long F;
                int g;
                if (i < 16) {
                    F = (B & C) | ((~B & (modulus - 1)) & D);
                    g = i;
                } else if (i < 32) {
                    F = (D & B) | ((~D & (modulus - 1)) & C);
                    g = (5 * i + 1) % 16;
                } else if (i < 48) {
                    F = B ^ C ^ D;
                    g = (3 * i + 5) % 16;
                } else {
                    F = C ^ (B | (~D & (modulus - 1)));
                    g = (7 * i) % 16;
                }
                F = (F + A + K[i] + M[g]) % modulus;
                A = D;
                D = C;
                C = B;
                B = (B + leftRotate(F, s[i])) % modulus;
            }
            a0 = (a0 + A) % modulus;
            b0 = (b0 + B) % modulus;
            c0 = (c0 + C) % modulus;
            d0 = (d0 + D) % modulus;
            start += 64;
            chunks--;
        }
        long[] cipher = new long[4];
        long mask = 255;
        cipher[0] = ((a0 & mask) << 24) + ((a0 & (mask << 8)) << 8) + ((a0 & (mask << 16)) >>> 8) + ((a0 & (mask << 24)) >> 24);
        cipher[1] = ((b0 & mask) << 24) + ((b0 & (mask << 8)) << 8) + ((b0 & (mask << 16)) >>> 8) + ((b0 & (mask << 24)) >> 24);
        cipher[2] = ((c0 & mask) << 24) + ((c0 & (mask << 8)) << 8) + ((c0 & (mask << 16)) >>> 8) + ((c0 & (mask << 24)) >> 24);
        cipher[3] = ((d0 & mask) << 24) + ((d0 & (mask << 8)) << 8) + ((d0 & (mask << 16)) >>> 8) + ((d0 & (mask << 24)) >> 24);

        return cipher;
    }
}

public class Solution1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        MD5 hash = new MD5();
        long[] cipher = hash.encrypt(message);
        System.out.printf("%x%x%x%x\n", cipher[0], cipher[1], cipher[2], cipher[3]);
    }
}
