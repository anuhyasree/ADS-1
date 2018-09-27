class Node {
	private int name;
	private Node nextnode;

	Node(int name) {
		this.name = name;
		this.nextnode = null;
	}

	public int getName() {
		return name;
	}
	public Node getNextNode() {
		return nextnode;
	}

	public void setName(int name) {
		 this.name = name;
	}
	public void setNextNode(Node nextnode) {
		this.nextnode = nextnode;
	} 
}
