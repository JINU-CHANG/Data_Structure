
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack<String> stack = new ArrayStack<String>();
		stack.push("1");
		stack.push("2");
		stack.pop();
		stack.print();
		stack.push("1");
		stack.push("2");
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.pop();
		stack.push("2");
		stack.pop();
		stack.print();
//			stack.push("apple");
//			stack.push("orange");
//			stack.push("cherry");
//			System.out.println(stack.peek());
//			stack.push("pear");
//			stack.print();
//			stack.pop();
//			System.out.println(stack.peek());
//			stack.push("grape");
//			stack.print();
			
		}

}
