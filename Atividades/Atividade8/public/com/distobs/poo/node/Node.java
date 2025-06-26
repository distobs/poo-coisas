package distobs.poo.node;

public class Node {
        public Node next;
        public Node prev;
        public int value;
        
        public Node(int value, Node next, Node prev) {
                this.value = value;
                this.next = next;
                this.prev = prev;
        }
}
