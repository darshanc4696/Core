package corejava;

import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] ratings = new int[n];
		for(int i=0; i<n; i++)
		{
			ratings[i] = sc.nextInt();
		}
		
		System.out.println(candy(ratings));

	}
	
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int sum = 1, i = 1;

        while(i<n)
        {
            if(i < n && ratings[i] == ratings[i-1])
            {
                sum += 1;
                i++;
                continue;
            }

            int peek = 1;
            while(i < n && ratings[i] > ratings[i-1])
            {
                peek++;
                sum += peek;
                i++;
            }

            int down = 1;
            while(i < n && ratings[i] < ratings[i-1])
            {
                sum += down;
                down++;
                i++;
            }

            if(down > peek)
            {
                sum += (down - peek);
            }

        }

        return sum;
    }

}
