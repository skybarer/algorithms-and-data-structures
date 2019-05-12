package conditions;

/**
 * @author : akashdhar
 * @date : 21-03-2019
 * @time : 09:02 PM
 */
public class If {
    public static void main(String[] args) {

        int b = 1;
        boolean a;
//  not printed
        if (a = false) System.out.println("a = false");
        if (a = true) System.out.println("a = true");
        if(!false) System.out.println("!false");
        if(!true) System.out.println("!true");
        if ("123".equals(String.valueOf(123))) System.out.println("condition is executed.");

    }
}
