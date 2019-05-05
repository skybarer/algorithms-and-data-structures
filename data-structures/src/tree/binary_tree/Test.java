package tree.binary_tree;

/**
 * @author : akashdhar
 * @date : 04-05-2019
 * @time : 07:17 PM
 */
public class Test {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(6);
        binaryTree.insert(4);
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(9);

        binaryTree.preOrder();
        binaryTree.inOrder();
        binaryTree.postOrder();

    }
}
