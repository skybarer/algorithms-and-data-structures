package tree.binary_search_tree;

/**
 * @author : akashdhar
 * @date : 05-05-2019
 * @time : 07:09 AM
 */
public class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(9);
        binarySearchTree.insert(15);
        binarySearchTree.insert(5);
        binarySearchTree.insert(20);
        binarySearchTree.insert(16);
        binarySearchTree.insert(8);
        binarySearchTree.insert(12);
        binarySearchTree.insert(3);
        binarySearchTree.insert(6);

        binarySearchTree.fromArrayBST(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});

        binarySearchTree.preOrder();
        binarySearchTree.inOrder();
        binarySearchTree.postOrder();

        System.out.println( "key exists or not: " + binarySearchTree.search(1));
    }
}
