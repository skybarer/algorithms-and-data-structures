package list.array_list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 08:14 AM
 */
public class ArrayListOfArrayList {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(1,2,3));

        System.out.println(list);
    }
}
