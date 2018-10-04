import java.util.Scanner;
/**.
 * Class for node.
 */
class Node{
    String data;
    Node next;
    Node(String val) {
        this.data=val;
    }
}
/**.
 * List of linkeds.
 */
class LinkedList {
    Node head;
    int size;
    LinkedList() {
        head = null;
        size =0;
    }
    void insertAt(int pos, String val)throws Exception{
        if (pos<0 || pos>size) {
        throw new Exception();
        }
        Node obj = new Node(val);
        head=insertAt(pos,head,obj,0);
    }
    Node insertAt(int pos, Node first, Node obj, int count) throws Exception{
        if (pos == count) {
            obj.next =first;
            size++;
            return obj;
        }
        first.next = insertAt(pos,first.next,obj,count+1);
        return first;
    }
    void reverse(){
        reverse(null,head);
    }
    void reverse(Node previous, Node current){
        if (current!=null) {
            reverse(current,current.next);
            current.next= previous;
        }else {
            head =previous;
        }
    }
    void display(){
        Node temp = head;
        String str = "";
        while(temp!=null){
            str += temp.data+ ", ";
            temp = temp.next;
        }
        System.out.println(str.substring(0, str.length()-2));

    }
    }

/**
 * Class for solution.
 */
class Solution {

    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (s.hasNextLine()) {
            String[] input = s.nextLine().split(" ");
            switch (input[0]) {
                case "insertAt" :
                try {
                ll.insertAt(Integer.parseInt(input[1]), input[2]);
                ll.display();
            } catch (Exception e) {
                    System.out.println(
                    "Can't insert at this position.");
                }
                break;
                case "reverse" :
                try {
                ll.reverse();
                ll.display();
            } catch (Exception e) {
                System.out.println("No elements to reverse.");
                }
                break;
                default : ;
            }
        }
    }

}

