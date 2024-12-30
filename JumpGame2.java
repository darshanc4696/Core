package corejava;

import java.util.Scanner;

public class JumpGame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar[] = new int[sc.nextInt()];
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		int jump = minJumps(ar);
		System.out.println(jump);

	}
	

	private static int minJumps(int[] ar) {
		
		int jump = 0;
		int coverage = 0, lastJumpIndex = 0; 
		int destination = ar.length-1;
		
		if(ar.length == 1) return jump;
		
		for(int i=0; i<ar.length; i++)
		{
			coverage = Math.max(coverage, i+ar[i]);
			
			if(lastJumpIndex == i)
			{
				lastJumpIndex = coverage;
				jump++;
				
				if(coverage == destination)
				{
					return jump;
				}
			}
		}
		
		return jump;
	}

}
