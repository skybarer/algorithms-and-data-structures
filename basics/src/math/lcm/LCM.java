package math.lcm;

/**
 * @author : akashdhar
 * @date : 16-06-2019
 * @time : 11:27 AM
 */
public class LCM {

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        System.out.println(lcm(12, 15));
    }

}
