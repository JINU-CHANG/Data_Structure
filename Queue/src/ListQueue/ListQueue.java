package ListQueue;

import java.util.NoSuchElementException;

public class ListQueue <E> {
	private Node <E> front, rear;    // ť�� ���� ������
	private int size; 
    public ListQueue() {        // ť ������
    	front = rear = null;    
    	size = 0;
    }
    public int     size()    { return size;}        // ť�� �ִ� �׸��� ���� ����
    public boolean isEmpty() { return (size == 0);} // ť�� empty�̸� true�� ����
    
    public void add(E newItem) {   // ť ���� ����
    	Node newNode = new Node(newItem, null);   // �� ��� ����
    	if (isEmpty()) front = newNode;     // ť�� empty�̸� front�� newNode�� ����Ŵ
    	else rear.setNext(newNode);			// �׷��� ������ rear�� next�� newNode�� ����Ŵ
    	rear = newNode;						// ���������� rear�� newNode�� ����Ű�� �Ѵ�.
    	size++;
    }
	
    public E remove() {  //ť ���� ����
		if (isEmpty()) throw new NoSuchElementException(); // underflow ��쿡 ���α׷� ����
		E frontItem = front.getItem();
		front = front.getNext();
		if (isEmpty()) rear = null;
		size--;
		return frontItem;
	}  

	public void print(){  // ť�� �׸���� ���
		for (Node p = front; p != null; p = p.getNext()) 
			System.out.print(p.getItem()+"\t ");
		System.out.println();
	}
}