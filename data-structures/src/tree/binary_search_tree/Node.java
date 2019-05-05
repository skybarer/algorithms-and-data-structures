package tree.binary_search_tree;

/**
 * @author : akashdhar
 * @date : 05-05-2019
 * @time : 06:59 AM
 */
public class Node {
    int data;
    Node lChild;
    Node rChild;

    public Node(int data) {
        this.data = data;
        this.lChild = this.rChild = null;
    }
}
