package recursion;

/**
 * @author : akashdhar
 * @date : 24-03-2019
 * @time : 02:36 PM
 */
public class TreeRecursion {

    public static void function(int n) {
        if (n > 0) {
            System.out.print(n + " ");
//            A recursion called more that one time.
//            Time complexity : O(pow(2,n))
//            space complexity : O(n)
            function(n - 1);
            function(n - 1);
        }
    }

    public static void main(String[] args) {
        function(3);
    }
}
