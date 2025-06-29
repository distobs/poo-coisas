package distobs.poo.linkedlist;
import distobs.poo.node.Node;

public class LinkedList {
        private Node head;
        private int length;
        
        void appendToNode(int val, Node appendTo) {
                if (appendTo == null) {
                        Node newNode = new Node(val, this.head, null);
                        this.head = newNode;
                } else {
                        Node newNode = new Node(val, appendTo.getNext(), appendTo);
			appendTo.setNext(newNode);
                }

		++length;
        }
        
	public Node getHead() {
		return this.head;
	}

	public int getLength() {
		return this.length;
	}

	public void setHead(Node n) {
		this.head = n;
	}

	public void setLength(int l) {
		this.length = l;
	}

        LinkedList(int headval) {
                this.head = new Node(headval, null, null);
                this.length = 1;
        }
}
