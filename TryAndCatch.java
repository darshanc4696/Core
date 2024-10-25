package corejava;

import java.util.Scanner;

class Demo
{
	Scanner sc = new Scanner(System.in);
	void alpha() throws Exception
	{
		try
		{
			int a =  sc.nextInt();
			int b= sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			
			System.out.println("handled in Demo and thrown");
			throw e;
		}
		System.out.println("End of Demo");
	}
	
}

class Demo56
{
	void fun1()
	{
		System.out.println("enter the Demo56");
		Demo d1 = new Demo();
		
		try {
			d1.alpha();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Handled in Demo56");
		}
		System.out.println("End of Demo56");
		
	}
}

public class TryAndCatch {

	public static void main(String[] args) {
		System.out.println("hello");
		Demo56 d = new Demo56();
		d.fun1();
		

}
}
