package arrays;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 01:59 PM
 */
public class ArrayDecleration {

    public static void main(String[] args) {

        // directly assigning values to the array
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr : " + arr[0]);
        // create an empty array of a particular size will set all values to 0
        int[] arr1 = new int[5];
        System.out.println("arr1 : " + arr1[4]);

        int[] arr2 = new int[3];
        // array initialisation  multiple values cannot be initialised.
        // arr2 = {1, 2};
        arr2[0] = 1;
        arr2[2] = 3;
        System.out.println("arr2" + arr2[2]);

        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Declaring array literal
    }
}
