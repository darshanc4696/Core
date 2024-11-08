package corejava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product
{
	String name;
	float price;
	
	public Product(String name, float price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	@Override
	public String toString() {
		return name+" - "+price;
	}
	
}

public class ProductPriceSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Product> al = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			String s = sc.nextLine();
			String[] ar = s.split(" - ");
			
			al.add(new Product(ar[0], Float.parseFloat(ar[1])));
		}
		
		Collections.sort(al, Comparator.comparingDouble(Product::getPrice)
				.thenComparing(Comparator.comparing(Product::getName).reversed()));
		
		for(Product p : al)
		{
			System.out.println(p);
		}
		
		

	}

}
