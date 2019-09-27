package swaping;

/**
 * @author : akashdhar
 * @date : 16-06-2019
 * @time : 10:19 AM
 */
public class SwapUsingBitwiseXOR {


    public static void main(String[] args) {

        int a = 12;
        int b = 25;

        System.out.printf("%d %d\n", a, b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("%d %d\n", a, b);


    }
}
