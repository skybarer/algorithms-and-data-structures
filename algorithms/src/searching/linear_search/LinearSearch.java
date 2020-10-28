package searching.linear_search;

/**
 * @author : akashdhar
 * @date : 25-05-2019
 * @time : 02:06 PM
 */

/*
*  Time-Complexity: O(n)
*/
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.findElement(arr, 6));
    }

    private boolean findElement(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) return true;
        }
        return false;
    }
}
