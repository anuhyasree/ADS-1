class LinkedList {
	private Node start;
	private int size;

	LinkedList() {
		this.start = null;
		this.size = 0;
	}

	public void pushRight(int name) {
		if (start == null) {
			start = new Node(name);
		} else {
			Node temp = start;
			Node a = new Node(name);
			while (temp.getNextNode() != null) {
				temp = temp.getNextNode();	
			}
			temp.setNextNode(a);
		}
		size++;
	}
	public void pushLeft(int name) {
		Node newnode = new Node(name);
		newnode.setNextNode(start);
		start = newnode;
		//System.out.println(start);
		size++;
		//System.out.println(size);
	}
	public int size() {
		return size;
	}
	public void popLeft() {
		if (start != null) {
			start = start.getNextNode();
			size--;
		} else {
			System.out.println("No nodes to remove");
		}
	}
	public void popRight() {
		if (start == null) {
			System.out.println("No nodes to remove");
		} else if (size < 2) {
			start = null;
			size--;
		} else {
			Node temp = start;
			while (temp.getNextNode().getNextNode() != null) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(null);
			size--;
		}
	}
	public void remove(int name) {
		Node temp = start;
		
			while (temp.getNextNode() != null) {
				temp = temp.getNextNode();
				if(name == temp.getName()) {
					temp = temp.getNextNode().getNextNode();
				}	
			}
	}
	public String toString() {
		String s = "";
		Node temp = start;
		if (temp == null) {
			return "Empty linked list";
		}
		while (temp.getNextNode() != null) {
			s += temp.getName() + ", ";
			temp = temp.getNextNode();
		} s += temp.getName();
		return s;
	}
}
