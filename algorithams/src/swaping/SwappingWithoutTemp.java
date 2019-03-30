package swaping;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 07:38 PM
 */
public class SwappingWithoutTemp {

    public static void main(String[] args) {
        int a = 20, b = 10;

        //before swaping
        System.out.println("Before Swapping the values of a and b are: a = " + a + ", b = " + b);

        //swapping
        a = a + b;
        b = a - b;
        a = a - b;

        //after swapping
        System.out.println("After Swapping the values of a and b are: a = " + a + ", b = " + b);
    }
}
