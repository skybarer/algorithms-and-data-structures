package day_14_scope;

/**
 * @author : akashdhar
 * @date : 17-03-2019
 * @time : 01:13 PM
 */
import java.util.Arrays;
import java.util.Scanner;

//  Sample Input:
//  3
//  1 2 5

class Difference {
    public int maximumDifference;
    private int[] elements;

    public Difference(int[] a) {
        this.elements = a;
        this.maximumDifference = 0;
    }

    // Add your code here
    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
    }


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
