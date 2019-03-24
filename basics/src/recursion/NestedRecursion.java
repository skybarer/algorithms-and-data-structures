package recursion;

/**
 * @author : akashdhar
 * @date : 24-03-2019
 * @time : 03:15 PM
 */
public class NestedRecursion {

//    recursion inside recursion


    public static int A(int n) {

        if (n > 100) return n - 10;

        return A(A(n + 11));
    }


    public static void main(String[] args) {
        System.out.printf("%d ", A(95));
    }
}
