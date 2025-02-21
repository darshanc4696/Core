package corejava;

import java.util.Scanner;

public class reverseBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverse(n));

	}
	
	private static int reverse(int n)
	{
		int result = 0;
		
		for(int i=0; i<4; i++)
		{
			int lastBit = n & 1;
			result = result << 1 | lastBit;
			n = n >> 1;
		}
		
		return result;
	}

}
