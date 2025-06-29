package distobs.poo.node;

public class Node {
        private Node next;
        private Node prev;
        private int value;

	public Node getNext() {
		return this.next;
	}

	public Node getPrev() {
		return this.prev;
	}

	public int getValue() {
		return this.value;
	}

	public void setNext(Node n) {
		this.next = n;
	}

	public void setPrev(Node n) {
		this.prev = n;
	}
        
	public void setValue(int v) {
		this.value = v;
	}

        public Node(int value, Node next, Node prev) {
                this.value = value;
                this.next = next;
                this.prev = prev;
        }
}
