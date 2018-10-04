/**.
 * Class for node.
 */
class Node {
    /**.
     * { var_description }
     */
    private String data;
    /**.
     * { var_description }
     */
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