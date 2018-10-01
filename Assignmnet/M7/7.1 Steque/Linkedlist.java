import java.util.Iterator;

public class Linkedlist implements Iterable {
    private class Node {
        int data;
        Node next;
        Node() {

        }
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node(int data, Node n) {
            this.data = data;
            this.next = n;
        }
    }
    Node head, tail;
    int size = 0;
    Linkedlist() {

    }
    public void push(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(data, head);
        head = node;
        size++;
    }
    public void enqueue(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }
    public int pop() throws Exception {
        if (size <= 1) {
            if (size == 1) {
                head = head.next;
                size--;
            }
            throw new Exception("Steque is empty.");
        } else {
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
    }
    public String toString() {
        Iterator i = iterator();
        if (size > 0) {
            String s = "";
            while (i.hasNext()) {
                s += i.next() + ", ";
            }
            return s.substring(0, s.length() - 2);
        }
        return null;
    }


    public Iterator iterator() {
        return new StequeIterator(head);
    }


    private class StequeIterator implements Iterator {
        Node current;
        StequeIterator(Node node) {
            this.current = node;

        }
        public boolean hasNext() { return current != null;}
        public void remove() {/*not supported*/}
        public Integer next() {
            Integer data = current.data;
            current = current.next;
            return data;
        }
    }
}