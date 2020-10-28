package swaping;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 07:20 PM
 */
public class SwapUsingTemp {


    public static int swap(int a, int b) {
        return a;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        System.out.printf("a = %s, b = %s\n", a, b);
        a = swap(b, b = a);
//        values are not swapped here
        System.out.printf("a = %s, b = %s\n", a, b);
    }
}
