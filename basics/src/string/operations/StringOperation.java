package string.operations;

/**
 * @author : akashdhar
 * @date : 30-06-2019
 * @time : 04:48 PM
 */
public class StringOperation {

    public static void main(String[] args) {
        String string = "akashdhar";
        System.out.println(string.substring(1)); // kashdhar
        System.out.println(string.substring(0, 2)); // ak
        System.out.println(string.toCharArray()); // akashdhar
        System.out.println(string.intern()); // akashdhar
        System.out.println(string.substring(1) + string.charAt(0)); // kashdhara
    }
}
