package distobs.poo.linkedlist;
import distobs.poo.node.Node;

public class LinkedList {
        public Node head;
        public int length;
        
        public void appendToNode(int val, Node appendTo) {
                if (appendTo == null) {
                        Node newNode = new Node(val, this.head, null);
                        this.head = newNode;
                } else {
                        Node newNode = new Node(val, appendTo.next, appendTo);
                        appendTo.next = newNode;
                }

		++length;
        }
        
        public LinkedList(int headval) {
                this.head = new Node(headval, null, null);
                this.length = 1;
        }
}
