package stack;

import stack.using_array.Stack;

/**
 * @author : akashdhar
 * @date : 04-05-2019
 * @time : 09:05 AM
 */
public class Test {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.display();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();
    }
}
