class LinkedList {

    private transient int size = 0;

    private Node head = null;

    //  add items in the linked list
    // time-complexity : O(n)
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }


    //  display all items in linked list
    // time-complexity : O(n)
    void display() {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    //size method in linked list
    // time-complexity : O(n)
    int size() {
        Node start = head;
        while (start != null) {
            size++;
            start = start.next;
        }

        return size;
    }

}
