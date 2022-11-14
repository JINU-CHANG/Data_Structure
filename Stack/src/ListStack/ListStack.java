
package ListStack;

import java.util.EmptyStackException;
public class ListStack<E> {
	private Node<E> top;      // 스택 top 항목을 가진 Node를 가리키기 위해
	private int size;         // 스택의 항목 수
	public ListStack() {      // 스택 생성자
		top = null;  
		size = 0;
	}	
	public int     size()    { return size;}           	// 스택에 있는 항목의 수를 리턴
	public boolean isEmpty() { return (size == 0);}   // 스택이 empty이면 true 리턴
	
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
		if (isEmpty()) throw new EmptyStackException(); // underflow시 프로그램 정지
		E topItem = top.getItem();	
		top = top.getNext();
		size--;
		return topItem;
	}
}
