package tree.avl;

/**
 * @author : akashdhar
 * @date : 05-05-2019
 * @time : 07:31 AM
 */
public class AVL {
    Node root = null;

    private Node LL_Rotation(Node p) {
        Node pl = p.lChild;
        Node plr = pl.rChild;

//        pl.rChild=plr.lChild;
//        p.lChild=plr.rChild;

        pl.rChild = p;
        pl.lChild = plr;

        pl.height = nodeHeight(pl);
        p.height = nodeHeight(p);
        plr.height = nodeHeight(plr);

        // if root is changed
        if (root == p) root = pl;

        return pl;
    }

    private Node LR_Rotation(Node p) {

        Node pl = p.lChild;
        Node plr = pl.rChild;

        pl.rChild = plr.rChild;
        p.lChild = plr.rChild;

        plr.lChild = pl;
        plr.rChild = p;

        pl.height = nodeHeight(pl);
        p.height = nodeHeight(p);
        plr.height = nodeHeight(plr);

        // if root is changed
        if (root == p) root = plr;

        return plr;
    }

    private Node RR_Rotation(Node p) {
        return p;
    }

    private Node RL_Rotation(Node p) {
        return p;
    }


    public int nodeHeight(Node current) {
        int hl, hr = 0;
        hl = current != null && current.lChild != null ? current.lChild.height : 0;
        hr = current != null && current.rChild != null ? current.rChild.height : 0;
        return hl > hr ? hl + 1 : hr + 1;
    }

    // finding the balance factor
    int balanceFactor(Node current) {
        int hl, hr = 0;
        hl = current != null && current.lChild != null ? current.lChild.height : 0;
        hr = current != null && current.rChild != null ? current.rChild.height : 0;
        return (hl - hr);
    }

    // BST does not allows duplicates
    private Node recursiveInsert(Node current, int data) {
        if (current == null) {
            Node newNode = new Node(data);
            newNode.height = 1;
            return newNode;
        }
        if (data < current.data) current.lChild = recursiveInsert(current.lChild, data);
        else if (data > current.data) current.rChild = recursiveInsert(current.rChild, data);

        // updating height at returning time
        current.height = nodeHeight(current);

        // code for rotation using balance factor

        if (balanceFactor(current) == 2 && balanceFactor(current.lChild) == 1) return LL_Rotation(current);
        else if (balanceFactor(current) == 2 && balanceFactor(current.lChild) == -1) return LR_Rotation(current);
        else if (balanceFactor(current) == -2 && balanceFactor(current.lChild) == -1) return RR_Rotation(current);
        else if (balanceFactor(current) == -2 && balanceFactor(current.lChild) == 1) return RL_Rotation(current);

        return current;
    }


    public void insert(int data) {
        root = recursiveInsert(root, data);
    }

}
