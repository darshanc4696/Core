package corejava;

class Demo11 
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	double add(int a , double b)
	{
		return a+b;	
	}
	
	float add(int a, float b)
	{
		return a+b;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
	
	float add(float a, int b)
	{
		return a+b;
	}
	
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	double add(int a, float b, double c)
	{
		return a+b+c;
	}
	
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		int i=1, j=2;
		float x=3.5f, y=4.0f;
		double m=5.6, n=6.7;
		
		Demo11 d = new Demo11();
		
		System.out.println(d.add(i,j));
		System.out.println(d.add(i,m));
		System.out.println(d.add(y,n)); // type promotion
		System.out.println(d.add(i,x,m));
		System.out.println(d.add(i,j,3.9)); // type promotion
		
		

	}

}
