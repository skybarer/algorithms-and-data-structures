package string.sequences;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 10:37 AM
 */
public class StringArraySubSequences {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        String input = "12345";
        int n = input.length();


        for (int k = 0; k < n; k++) {
            for (int j = k; j <= n; j++) {
                for (int i = 0; i <= j; i++) {
                    set.add(input.substring(i, j));
                }
            }
        }

        System.out.println(set);
    }
}
