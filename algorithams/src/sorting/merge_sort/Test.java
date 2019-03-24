package sorting.merge_sort;


import static sorting.merge_sort.MergeSort.mergeSort;

public class Test {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray);

        for (int i : intArray) {
            System.out.printf("%d ", i);
        }

    }
}