import java.util.Scanner;
/**.
Node the class
*/
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
    }
}
/**.
Likedlist the solution
*/
class linkedlist {
    int size;
    int count;
    Node head, tail;
    String result = "";
    linkedlist(int s, int c) {
        size = s;
        count = c;
    }

    /**.
     * { function_description }
     */
    public void josephproblem() {
        Node newNode = new Node(0);
        head = newNode;
        tail = newNode;
        for (int i = 1; i < size; i++) {
            Node n = new Node(i);
            tail.next = n;
            tail = n;
        }
        int c;
        Node temp;
        while (size != 1) {
            for (c = 1; c < count; c++) {
                temp = head;
                head = head.next;
                tail.next = temp;
                tail = temp;
            }
            result += head.data + " ";
            head = head.next;
            c = 1;
            size--;
        }
        result += head.data;
        System.out.println(result);
    }
}
/**.
Solution the class
@param args the arguments
*/
final class Solution {
    public static void main(final String[] args) {
        linkedlist l;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split(" ");
            l = new linkedlist(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
            l.josephproblem();
        }
    }

}