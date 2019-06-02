package string.reverse.using_recursion;

import org.jetbrains.annotations.NotNull;

/**
 * @author : akashdhar
 * @date : 01-06-2019
 * @time : 08:48 PM
 */
public class StringReverse {

    @NotNull
    public static String reverse(String input) {
        if (input.isEmpty()) return input;
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("akash"));
    }
}
