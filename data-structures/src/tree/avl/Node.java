package tree.avl;

/**
 * @author : akashdhar
 * @date : 05-05-2019
 * @time : 07:31 AM
 */
public class Node {
    int data;
    int height;
    Node lChild;
    Node rChild;

    public Node(int data) {
        this.data = data;
        this.lChild = null;
        this.rChild = null;
        this.height = 0;
    }
}
