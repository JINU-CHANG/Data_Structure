
package ListStack;

import java.util.EmptyStackException;
public class ListStack<E> {
	private Node<E> top;      // ���� top �׸��� ���� Node�� ����Ű�� ����
	private int size;         // ������ �׸� ��
	public ListStack() {      // ���� ������
		top = null;  
		size = 0;
	}	
	public int     size()    { return size;}           	// ���ÿ� �ִ� �׸��� ���� ����
	public boolean isEmpty() { return (size == 0);}   // ������ empty�̸� true ����
	
	public void push(E item) {
		Node newNode = new Node(item, top);
		top = newNode;
		size++;
	}
	
	public E peek() {
		return top.getItem();
	}
	
	public void print() {
		
		 Node<E> N=top;
		 Node<E> next=N;
		 for(int i=0;i<size;i++) {
			 System.out.print(next.getItem()+" ");
			 next = next.getNext();
		 }
		 System.out.println();
	}
	
	public E pop() {
		if (isEmpty()) throw new EmptyStackException(); // underflow�� ���α׷� ����
		E topItem = top.getItem();	
		top = top.getNext();
		size--;
		return topItem;
	}
}
