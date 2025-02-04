package corejava;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int bit = n;
		int count = 0;
		
		while(bit > 0)
		{
			if((bit & 1) == 1) count++;
			
			bit = bit>>1;
		}
		
		System.out.println(bit);
		System.out.println(count);
		
		if(count == 1) System.out.println("power");
		else System.out.println("no power");
		
			

	}

}
