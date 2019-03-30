package swaping;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 07:36 PM
 */
public class SwappingUsingXOR {

    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println("Old values of x and y are " + x + ", " + y);
        x = x ^ y ^ (y = x);
        System.out.println("New values of x and y are " + x + ", " + y);
    }
}
