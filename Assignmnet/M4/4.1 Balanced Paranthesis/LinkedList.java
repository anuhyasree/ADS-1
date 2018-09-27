/**
 * List of linkeds.
 *
 * @param      <E>   { Generic }
 */
public class LinkedList<E> {
	/**
	 * Class for node.
	 */
	private class Node {
		E data;
		Node next;
		/**
		 * Constructs the object.
		 */
		Node() {

		}
		/**
		 * Constructs the object.
		 *
		 * @param      data  The data
		 */
		Node(E data) {
			this.data = data;
		}
		/**
		 * Constructs the object.
		 *
		 * @param      data  The data
		 * @param      next  The next
		 */
		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
	Node head, tail;
	E data;
	int size = 0;
	/**
	 * Constructs the object.
	 */
	LinkedList() {

	}
	/**
	 * adding to linked lists.
	 *
	 * @param      n     { parameter_description }
	 */
	public void add(E n) {
		Node node = new Node(n, head);
		if (head == null) {
			head = node;
			tail = head;
		}
		head = node;
		size++;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String s = "";
		Node thead = head;
		while (thead.next != null) {
			s += (thead.data);
			thead = thead.next;
		} s += (thead.data);
		return s;
	}
	/**
	 * Pops head.
	 *
	 * @return     { description_of_the_return_value }
	 */
	public E popHead() {
		if (head != null) {
			Node temp = head;
			head = head.next;
			size--;
			return temp.data;
		}
		return null;
	}
	/**
	 * Pops tail.
	 *
	 * @return     { description_of_the_return_value }
	 */
	public E popTail() {
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		E element = temp.next.data;
		temp.next = null;
		tail = temp;
		size--;
		return element;

	}
	/**
	 * Determines if empty.
	 *
	 * @return     True if empty, False otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	/**
	 * Determines if braces are closed.
	 *
	 * @param      line  The line
	 *
	 * @return     { description_of_the_return_value }
	 */
	public boolean closed(String[] line) {
		LinkedList<String> ll =new LinkedList<String>();
		for (int j = 0; j < line.length; j++) {
                // System.out.println(line[j]);
                if (line[j].equals("[") || line[j].equals("(") || line[j].equals("{")) {
                    ll.add(line[j]);
                } else if (line[j].equals("]")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("["))) {
                        return false;
                    }
                } else if (line[j].equals(")")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("("))) {
                        return false;
                    }
                } else if (line[j].equals("}")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("{"))) {
                        return false;
                    }
                }
            }
            if (ll.isEmpty()) {
            	return true;
            } else {
            	return false;
            }
	}
}
