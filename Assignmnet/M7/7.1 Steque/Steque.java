class Node {
    String data;
    Node next;
    Node(String item) {
        this.data = item;
    }
}
class Steque {
    Node start, end;
    int size = 0;
    Steque() {
        start = null;
        end = null;
    }
    void push(String item) {
        Node obj = new Node(item);
        if (size == 0) {
            start = obj;
            end = start;
            size++;
            return;
        }
        obj.next = start;
        start = obj;
        size++;

    }
    void enqueue(String item) {
        Node obj = new Node(item);
        if (size == 0) {
            start = obj;
            end = start;
            size++;
            return;
        }
        end.next = obj;
        end = obj;
        size++;
    }
    String pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Steque is empty.");
        }
        String data = start.data;
        start = start.next;
        size--;
        return data;
    }
    boolean isEmpty() {
        return size == 0;
    }
    public String toString() {
        // if(isEmpty()){

        // }
        Node temp = start;
        String res = "";
        while (temp != null) {
            res += temp.data + ", ";
            temp = temp.next;
        }
        return res.substring(0, res.length() - 2);
    }
}
