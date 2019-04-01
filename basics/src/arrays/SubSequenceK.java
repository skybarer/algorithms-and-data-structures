package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 10:51 AM
 */
public class SubSequenceK {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;

       /* for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                list.add(Arrays.asList(arr[i], arr[j]));
            }
        }*/

        // if there are no duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0)
                        System.out.printf("(%d %d %d),", arr[i], arr[j], arr[k]);
                }
            }
        }
        System.out.println(list);
    }
}