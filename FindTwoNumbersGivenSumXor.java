package corejava;

import java.util.Scanner;

public class FindTwoNumbersGivenSumXor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int xor = sc.nextInt();
		
		computeNumbers(sum, xor);

	}

	private static void computeNumbers(int sum, int xor) {
		
		if(sum < xor) {System.out.println("not possible"); return ;}
		if((sum-xor)%2 != 0) 
		{
			System.out.println("not possible"); 
			return ;
		}
		
		int a = (sum-xor)/2;
		int b = xor + a;
		
		System.out.println("a = "+a + " b = " + b);
			
	}

}
