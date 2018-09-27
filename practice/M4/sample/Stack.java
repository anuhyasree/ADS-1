import java.util.*;

// class Stack {
//  String[] arr;
//  int n;
//  Stack() {
//      arr = new String[10];
//      n = 0;
//  }

//  void push(String item) {
//      arr[n++] = item;

//  }
//  String pop() {
//      if (isEmpty()) {
//          return null;

//      }
//      String pop = arr[--n];
//      arr[n] = null; // this is called loitering
//      return pop;

//  }
//  boolean isEmpty() {
//      if (n == 0) {
//          return true;
//      }
//      return false;
//  }
//  int size() {
//      return n;
//  }
// }

class Node {
    int data;
    Node next;
    Node() {

    }
    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    Node start;
    int n;
    LinkedList(){
        n = 0;
    }
    void insert(int data) {
        Node obj = new Node(data);
        if (n==0) {
            start = obj;
            n++
            return;
        }
        Node temp =  start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = obj;
    }

}
