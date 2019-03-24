package recursion;

/**
 * @author : akashdhar
 * @date : 24-03-2019
 * @time : 03:04 PM
 */

// a circular recursion is called indirect recursion
public class IndirectRecursion {

    public static void A(int n) {
        if (n > 0) {
            System.out.printf("%d ", n);
            B(n - 1);
        }
    }

    public static void B(int n) {
        if (n > 1) {
            System.out.printf("%d ", n);
            A(n / 2);
        }
    }

    public static void main(String[] args) {
        A(20);
    }
}
