package tree.binary_tree;

/**
 * @author : akashdhar
 * @date : 04-05-2019
 * @time : 06:50 PM
 */

class Node {
    int data;
    Node lChild;
    Node rChild;

    public Node(int data) {
        this.data = data;
        this.lChild = null;
        this.rChild = null;
    }
}

public class BinaryTree {
    Node root = null;

    /*
    basic operations that can be formed
        1.insert
        2.delete
        3.search
    */

    private Node addRecursive(Node current, int data) {
        if (current == null) return new Node(data);

        if (data < current.data) {
            current.lChild = addRecursive(current.lChild, data);
        } else if (data > current.data) {
            current.rChild = addRecursive(current.rChild, data);
        } else {
            // value already exists
            return current;
        }
        return current;
    }

    // inserting a element
    public void insert(int data) {
       /*
       to create a node
       if root node is null insert into root
       if root node is not null insert either left or right
        */
        root = addRecursive(root, data);
    }


    // deleting the element
    public int delete() {
        return 0;
    }


    // traversing the elements

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
            recursivePreOrderTraversal(current.lChild);
            System.out.printf("%d ", current.data);
            recursivePreOrderTraversal(current.rChild);
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
            recursivePreOrderTraversal(current.lChild);
            recursivePreOrderTraversal(current.rChild);
            System.out.printf("%d ", current.data);
        }
    }

    // performing the pre-order traversal
    public void postOrder() {
        System.out.print("PostOrder : ");
        recursivePostOrderTraversal(root);
        System.out.printf("\n");
    }

}
