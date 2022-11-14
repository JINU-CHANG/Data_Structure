
import java.util.EmptyStackException;
public class ArrayStack<E> {
	private E s[];
	private int top; //top의 인덱스
	public ArrayStack() {
		s = (E[]) new Object[1];
		top = -1;
	} //틀 이해하기 왜 -1이냐? 0일때는 데이터가 하나 있다는 의미. -1이여야만 없는 것이 된다.
	public int size() {return top+1;}
	public boolean isEmpty() {return(top==-1);}
	
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	
	public void push(E newItem) {
		if (size()== s.length) {
			resize(2*s.length);
		} // 코드 시험 문제. 이 정도는 쓸 줄 알아야 함. 배열이 나오면 resize문제가 있다.
		
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
		if (isEmpty()) System.out.print("스택이 비어있음.");   
		else{
			for(int i=0; i<size();i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		}
	}
	
	public E pop() {
		if (isEmpty()) throw new EmptyStackException(); // underflow시 프로그램 정지
		E item = s[top];
		s[top--]=null; //먼저 s[top]=null 되고 top-- 진행
		if(size()>0 && size()==s.length/4)  //4분의 1이 됐을 때 반으로 줄여줌.
			resize(s.length/2);
		
		return item;
		
	}
	
	
}
