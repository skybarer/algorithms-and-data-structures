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
        else if (data > current.data) current.rChild = recursiveInsert(current.rChild, data);
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
        System.out.print("\n");
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
        System.out.print("\n");
    }

    public void fromArrayBST(int[] bstArray) {
        for (int j : bstArray) {
            root = recursiveInsert(root, j);
        }
    }

    // search a element exists or not
    public boolean search(int data) {
        Node current = root;
        while (current != null) {
            if (data == current.data) return true;
            if (data < current.data) current = current.lChild;
            else current = current.rChild;
        }
        return false;
    }

    private int findSmallestValue(Node root) {
        return root.lChild == null ? root.data : findSmallestValue(root.lChild);
    }

    private Node deleteRecursive(Node current, int data) {

        if (current == null) {
            return null;
        }

        if (data == current.data) {
            // Case 1: no children
            if (current.lChild == null && current.rChild == null) {
                return null;
            }

            // Case 2: only 1 child
            if (current.rChild == null) {
                return current.lChild;
            }

            if (current.lChild == null) {
                return current.rChild;
            }

            // Case 3: 2 children
            int smallestValue = findSmallestValue(current.rChild);
            current.data = smallestValue;
            current.rChild = deleteRecursive(current.rChild, smallestValue);
            return current;
        }
        if (data < current.data) {
            current.lChild = deleteRecursive(current.lChild, data);
            return current;
        }

        current.rChild = deleteRecursive(current.rChild, data);
        return current;

    }

    // deleting the element from BST
    public void delete(int data) {
        Node current = root;
        deleteRecursive(current, data);

    }


    public boolean isEmpty() {
        return root == null;
    }


}
