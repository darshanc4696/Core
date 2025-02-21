package corejava;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
	
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Push"+"\n"+"2. Pop"+"\n"+"3.Peek\n");
			System.out.println("Enter your choice");
			int n = sc.nextInt();
			
			switch(n)
			{
				case 1:
					int k = sc.nextInt();
					push(k);
					break;
				case 2:
					System.out.println(pop());
					break;
				case 3:
					System.out.println(peek());
					break;
				default:
					System.out.println("wrong choice");
					break;
					
			}
			
			System.out.println("Do you want to continue? (Y/N)");
			String choice = sc.next();
			if(choice.equals("N")) break;
		}

	}

	private static int peek() {
		
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.add(stack1.pop());
			}
		}
		
		return stack2.peek();
		
		
	}

	private static int pop() {
		peek();
		return stack2.pop();
	}

	 private static void push(int k) {
		stack1.add(k);
		
	}
	
	

}
