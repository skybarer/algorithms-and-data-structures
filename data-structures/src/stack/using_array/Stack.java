package stack.using_array;

/**
 * @author : akashdhar
 * @date : 04-05-2019
 * @time : 09:06 AM
 */
public class Stack {

    // stack is a linear data structure that follows FIFO - FIRST IN FIRST OUT

    // creating a initial capacity of size 10
    int[] array = new int[10];
    int pointer = 0;

    // empty constructor to create a sack object
    public Stack() {
    }

    // to increase the capacity of the array
    public void ensureCapacity() {

    }

    // to push a element into the stack
    public void push(int data) {
        array[pointer] = data;
        pointer++;
    }

    // to remove an element from stack
    public int pop() {
        pointer--;
        if (pointer < 0) try {
            throw new Exception("No elements to pop");
        } catch (Exception e) {
            e.printStackTrace();
        }
        int popValue = array[pointer];
        array[pointer] = -1;
//        pointer--;
        return popValue;
    }

    public void display() {
        for (int i = 0; i < pointer; i++) {
            if (i == pointer - 1)
                System.out.printf("%d\n", array[i]);
            else
                System.out.printf("%d ", array[i]);
        }
    }


}
