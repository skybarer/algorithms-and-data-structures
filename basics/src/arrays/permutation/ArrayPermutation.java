package arrays.permutation;

import java.util.List;
import java.util.Collections;


/**
 * @author : akashdhar
 * @date : 29-09-2019
 * @time : 04:02 PM
 */
public class ArrayPermutation {

    private static void permutingArray(List<Integer> arrayList, int element){
        for(int i = element; i < arrayList.size(); i++){
            Collections.swap(arrayList, i, element);
            permutingArray(arrayList, element+1);
            Collections.swap(arrayList,element, i);
        }
        if (element == arrayList.size() -1){
            System.out.println(java.util.Arrays.toString(arrayList.toArray()));
        }
    }
    public static void main(String[] args){
        permutingArray(java.util.Arrays.asList(1,2,3,4,5), 0);
    }
}
