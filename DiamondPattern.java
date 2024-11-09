package corejava;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2 == 0)
		{
			System.out.println("Not possible");
		}
		else
		{
//			for(int i=1; i<=n; i++)
//			{
//				for(int j=1; j<=n; j++)
//				{
//					if(i==1 && j == (n/2))
//					{
//						System.out.print("*"+" ");
//					}
//					else if(i==n && j == (n/2))
//					{
//						System.out.print("*"+" ");
//					}
//					else if(i%2 != 0 && j%2 != 0)
//					{
//						System.out.print("*"+" ");
//					}
//					else if(i%2 == 0 && (j==0 || j==n))
//					{
//						System.out.print("*"+" ");
//					}
//					else
//					{
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
			
			int x=n/2, y=n/2;
			
			for(int i=1; i<=n; i++)
			{
				for(int j=0; j<=n ;j++)
				{
					if(j== x || j== y)
					{
						System.out.print("*"+" ");
					}
					else
					{
						System.out.print(" "+" ");
					}
					
				}
				
				if(i <= n/2) 
				{
					x--; y++;
				}
				else
				{
					x++; y--;
				}
				System.out.println();
			}
		}
		
		
		
	}

}
