package corejava;

import java.util.Scanner;

public class Fiboncci {

	public static void main(String args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers required");
		int n= sc.nextInt();
		
		int a=0, b=1, x=0;
		System.out.println(a+"\n"+b);
		
		for(int i=2; i<n; i++)
		{
			x=a+b;
			System.out.println(x);
			a = b;
			b = x;
		}

	}

}
