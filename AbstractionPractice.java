package corejava;


class Demo13
{
	public void dance()
	{
		System.out.println("Dancing in Demo13");
	}
}


abstract class Demo14 extends Demo13
{
	abstract void write();
	
	@Override
	public void dance() 
	{
		System.out.println("Dancing in Demo14");
	}
		
}

class Demo15 extends Demo14
{
	@Override
	void write() 
	{
		System.out.println("writing");
		
	}
	
	@Override
	public void dance() 
	{
		super.dance();
		System.out.println("inside Demo15 dance");
	}
}
public class AbstractionPractice {

	public static void main(String[] args) 
	{
		
		Demo15 d = new Demo15();
		
		d.dance();
		

	}

}
