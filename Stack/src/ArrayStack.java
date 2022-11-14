
import java.util.EmptyStackException;
public class ArrayStack<E> {
	private E s[];
	private int top; //top�� �ε���
	public ArrayStack() {
		s = (E[]) new Object[1];
		top = -1;
	} //Ʋ �����ϱ� �� -1�̳�? 0�϶��� �����Ͱ� �ϳ� �ִٴ� �ǹ�. -1�̿��߸� ���� ���� �ȴ�.
	public int size() {return top+1;}
	public boolean isEmpty() {return(top==-1);}
	
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	
	public void push(E newItem) {
		if (size()== s.length) {
			resize(2*s.length);
		} // �ڵ� ���� ����. �� ������ �� �� �˾ƾ� ��. �迭�� ������ resize������ �ִ�.
		
		s[++top]=newItem; // top=top+1 s[top]

	}
	
	public void resize(int newSize) {
		E t[] = (E[]) new Object[newSize];
		
		for(int i=0; i<size() ; i++) {
			t[i]=s[i];
		}
		s = (E[]) t;
	}
	
	public void print() {
		if (isEmpty()) System.out.print("������ �������.");   
		else{
			for(int i=0; i<size();i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		}
	}
	
	public E pop() {
		if (isEmpty()) throw new EmptyStackException(); // underflow�� ���α׷� ����
		E item = s[top];
		s[top--]=null; //���� s[top]=null �ǰ� top-- ����
		if(size()>0 && size()==s.length/4)  //4���� 1�� ���� �� ������ �ٿ���.
			resize(s.length/2);
		
		return item;
		
	}
	
	
}
