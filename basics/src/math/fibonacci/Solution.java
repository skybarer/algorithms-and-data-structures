package math.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : akashdhar
 * @date : 13-04-2019
 * @time : 12:37 PM
 */
public class Solution {


    public static List<BigInteger> fibnocaii(long n) {
        List<BigInteger> list = new ArrayList<>();

        BigInteger fib0 = BigInteger.ZERO;
        BigInteger fib1 = BigInteger.ONE;
        BigInteger fib2 = BigInteger.ZERO;

        list.add(fib0);
        list.add(fib1);

        for (long i = 0; i < n; i++) {
            fib2 = fib0.add(fib1);
            list.add(fib2);
            fib0 = fib1;
            fib1 = fib2;
        }
        return list;
    }


    public static void main(String[] args) {

        System.out.println(fibnocaii(1000));

    }

}
