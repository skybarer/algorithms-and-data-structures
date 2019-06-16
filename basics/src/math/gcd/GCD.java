package math.gcd;

/**
 * @author : akashdhar
 * @date : 16-06-2019
 * @time : 11:13 AM
 */
public class GCD {

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(2, 3));
    }
}
