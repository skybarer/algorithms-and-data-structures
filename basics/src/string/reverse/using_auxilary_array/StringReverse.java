package string.reverse.using_auxilary_array;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 01-06-2019
 * @time : 09:10 PM
 */
public class StringReverse {

    public static String reverse(String input) {
        char[] charArray = input.toCharArray();
        char[] auxilaryArray = new char[input.length()];

        for (int i = input.length() - 1, j = 0; j < input.length(); i--, j++) {
            auxilaryArray[j] = charArray[i];
        }
        return Arrays.toString(auxilaryArray);
    }

    public static void main(String[] args) {
        System.out.println(reverse("akash"));
    }
}
