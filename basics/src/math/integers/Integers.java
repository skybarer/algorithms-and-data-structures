package math.integers;

import java.math.BigInteger;

/**
 * @author : akashdhar
 * @date : 20-04-2019
 * @time : 05:32 PM
 */
public class Integers {

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);// -2147483648
        System.out.println(Integer.MAX_VALUE);// 2147483647

        System.out.println(Integer.toHexString(Integer.MAX_VALUE));
        System.out.println(Integer.toHexString(Integer.MIN_VALUE));

        System.out.println(Integer.hashCode(Integer.MAX_VALUE));
        System.out.println(Integer.hashCode(Integer.MIN_VALUE));

        // Numeric overflow in expression
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println(Integer.MAX_VALUE + 1);


        // binary representation
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));


        System.out.println(Integer.MAX_VALUE); // 10 power 9
        System.out.println(Long.MAX_VALUE); // 10 power 18
        System.out.println(); // 10 power 18

        System.out.println(new BigInteger("21332142142142134321").mod( new BigInteger("10")));
        System.out.println(new BigInteger("21332142142142134321").divide( new BigInteger("10")));

        System.out.println((2971215073.0 / 1836311903));

    }
}
