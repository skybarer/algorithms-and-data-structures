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

    public Node(int data, Node lChild, Node rChild) {
        this.data = data;
        this.lChild = lChild;
        this.rChild = rChild;
    }
}

public class BinaryTree {
    Node root = null;

}
