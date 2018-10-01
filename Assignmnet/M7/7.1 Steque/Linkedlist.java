class Node {
    int data;
    Node next;
}
class Linkedlist {
    private Node start = new Node();
    int size;
    void push(final int value) {
        Node val = start;
        start = new Node();
        start.data = value;
        start.next = val;
        size++;
    }
    int pop() {
        int c = start.data;
        start = start.next;
        return c;
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return (start.next == null);
    }
    Node first;
    Node last;
    public void enqueue(int item) {
        Node x = new Node();
        item = x.data;
        if (isEmpty()) {
            first = x;
            last = x;
        } else {
            last.next = x;
            last = x;
        }
    }

}
