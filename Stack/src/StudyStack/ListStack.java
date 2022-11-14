package StudyStack;

public class ListStack<E> {
	public Node top;
	
	public ListStack() {
		top = null;
	}
	
	public void push(E newItem) {
		Node newNode = new Node(newItem, top);
		top = newNode;
	}
	
	public E peek() {
		return (E) top.getItem();
	}
	
	public void print() {
		Node n = top;
		while(true) {
			
			System.out.print(n.getItem()+" ");
			n = n.getNext();
			if(n == null) break;
			
		}
		System.out.println();
	}
	
	public void pop() {
		top = top.getNext();
	}
}
