package tree.binary_search_tree;

/**
 * @author : akashdhar
 * @date : 05-05-2019
 * @time : 07:01 AM
 */
public class BinarySearchTree {

    Node root = null;

    // BST does not allows duplicates
    private Node recursiveInsert(Node current, int data) {
        if (current == null) return new Node(data);
        if (data < current.data) current.lChild = recursiveInsert(current.lChild, data);
        else if(data > current.data) current.rChild = recursiveInsert(current.rChild, data);
        return current;
    }

    public void insert(int data) {
        root = recursiveInsert(root, data);
    }


     /*
    we can do tree traversal in 4 ways
    1.preOrder
    2.inOrder
    3.postOrder
    4.levelOrder
    */

    // helper function for traversal
    private void recursivePreOrderTraversal(Node current) {
        if (current != null) {
            System.out.printf("%d ", current.data);
            recursivePreOrderTraversal(current.lChild);
            recursivePreOrderTraversal(current.rChild);
        }
    }

    // performing the pre-order traversal
    public void preOrder() {
        System.out.print("PreOrder  : ");
        recursivePreOrderTraversal(root);
        System.out.printf("\n");
    }


    // helper function for traversal
    private void recursiveInOrderTraversal(Node current) {
        if (current != null) {
            recursiveInOrderTraversal(current.lChild);
            System.out.printf("%d ", current.data);
            recursiveInOrderTraversal(current.rChild);
        }
    }

    // performing the in-order traversal
    public void inOrder() {
        System.out.print("InOrder   : ");
        recursiveInOrderTraversal(root);
        System.out.printf("\n");
    }

    // helper function for traversal
    private void recursivePostOrderTraversal(Node current) {
        if (current != null) {
            recursivePostOrderTraversal(current.lChild);
            recursivePostOrderTraversal(current.rChild);
            System.out.printf("%d ", current.data);
        }
    }

    // performing the pre-order traversal
    public void postOrder() {
        System.out.print("PostOrder : ");
        recursivePostOrderTraversal(root);
        System.out.printf("\n");
    }

    public void fromArrayBST(int[] bstArray) {
        for (int i = 0; i < bstArray.length; i++) {
            root = recursiveInsert(root, bstArray[i]);
        }
    }
}
