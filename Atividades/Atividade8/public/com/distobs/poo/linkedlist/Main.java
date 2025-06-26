package distobs.poo.linkedlist;
import distobs.poo.node.Node;

public class Main {
        public static void main(String args[]) {
                LinkedList lista = new LinkedList(1);
                
                Node temp = lista.head;

                for (int i = 2; i <= 10; ++i) {
                        lista.appendToNode(i, temp);
                        temp = temp.next;
                }
                
                temp = lista.head;
                for (int i = 0; i < lista.length; ++i) {
                        System.out.println(temp.value);
                        temp = temp.next;
                }

		temp = lista.head;

		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
        }
}
