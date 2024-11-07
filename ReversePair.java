package corejava;

import java.util.Scanner;

public class ReversePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] ar = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
		
		System.out.println(reversePairs(ar));

	}

	private static int reversePairs(int[] nums) {
		int count = 0; 

        for(int i=0; i<nums.length-1; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i] > (2*(long)nums[j])) 
                {
                	System.out.println(i+", "+j+"["+nums[i]+", "+2*nums[j]+"]");
                    count++;
                }
            }
        }

        return count;
	}

}
