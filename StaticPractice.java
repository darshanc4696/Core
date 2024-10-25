package corejava;

class Demo12
{
	static float r;
	int a,b;
	static
	{
		System.out.println("Inside the static block");
		r=5.12f;
	}
	
	static void code()
	{
		System.out.println("Inside the static method");
	}
	
	{
		System.out.println("Inside the instance block");
	}
	
	void code1()
	{		
		System.out.println("Inside the instance method");
	}
	
	public Demo12()
	{		
		System.out.println("Inside the Constructor");
	}
	
	
}


public class StaticPractice {

	public static void main(String[] args) 
	{
		Demo12.code();
		
		Demo12 d = new Demo12(); // instance block will be called after object creation but before calling the constructor
		d.code1();

	}

}
