package distobs.poo.linkedlist;
import distobs.poo.node.Node;

public class Main {
        public static void main(String args[]) {
                LinkedList lista = new LinkedList(1);
                
                Node temp = lista.getHead();

                for (int i = 2; i <= 10; ++i) {
                        lista.appendToNode(i, temp);
                        temp = temp.getNext();
                }
                
                temp = lista.getHead();

                for (int i = 0; i < lista.getLength(); ++i) {
                        System.out.println(temp.getValue());
                        temp = temp.getNext();
                }

		temp = lista.getHead();

		while (temp != null) {
			System.out.println(temp.getValue());
			if (temp.getNext() != null) {
				temp = temp.getNext();
			} else {
				break;
			}
		}

		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getPrev();
		}
        }
}
