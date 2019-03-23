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
        if (a = false) System.out.println("If statement without assigning inside parenthesis ");
        if ("123".equals(String.valueOf(123))) System.out.println("condition is executed.");
    }
}
