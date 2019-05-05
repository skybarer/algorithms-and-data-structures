package tree.avl;

/**
 * @author : akashdhar
 * @date : 05-05-2019
 * @time : 07:30 AM
 */
public class Test {
    public static void main(String[] args) {
        AVL avl = new AVL();

        avl.insert(50);
        avl.insert(10);
        avl.insert(20);

        System.out.println(avl);
    }
}
