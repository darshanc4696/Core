package corejava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employe
{
	String name;
	String title;
	
	public Employe()
	{
		
	}
	
	public Employe(String name, String title)
	{
		this.name = name;
		this.title = title;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	@Override
	public String toString()
	{
		return this.name+"-"+this.title;
	}
}

public class EmployeeProjectSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employe> al = new ArrayList<Employe>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++)
		{
			String s = sc.nextLine();
			String[] ar = s.split("-");
			
			Employe e = new Employe(ar[0], ar[1]);
			
			al.add(e);
		}
		
		
		Collections.sort(al, Comparator.comparing(Employe::getTitle)
				.thenComparing(Comparator.comparing(Employe::getName).reversed()));
		
		for(Employe s : al)
		{
			System.out.println(s);
		}

	}

}


//Alice-Project Alpha
//Bob-Project Beta
//Charlie-Project Alpha
//David-Project Omega
