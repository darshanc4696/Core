package corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(List.of(1, 2, 3)));  // Make rows mutable
        matrix.add(new ArrayList<>(List.of(4, 5, 6)));
        matrix.add(new ArrayList<>(List.of(7, 8, 9)));
        
        transpose(matrix);
        
        for(List<Integer> l : matrix)
		{
			for(int i : l)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

	private static void transpose(List<List<Integer>> matrix) {
		
		
		for(int i=0; i<matrix.size(); i++)
		{
			for(int j=i; j<matrix.get(i).size(); j++)
			{
				int temp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
			}
		}
		
	}

}
