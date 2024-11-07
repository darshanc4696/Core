package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Book
{
	int id;
	String title;
	int price;
	float rating;
	String Author;
	int discount;
	
	public Book() {
		super();
	}

	public Book(int id, String title, int price, float rating, String author, int discount) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.rating = rating;
		Author = author;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return id+","+title+","+price+","+rating+","+Author+","+discount;
	}
	
	

}

public class BookSaleSorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++)
		{
			String bt = sc.nextLine();
			String[] s = bt.split(",");
			
			list.add(new Book(Integer.parseInt(s[0]), s[1], 
					Integer.parseInt(s[2]), Float.parseFloat(s[3]), 
					s[4], Integer.parseInt(s[5])));
		}
		
		int criteria = sc.nextInt();
		
//		switch (criteria) {
//		case 1: {
//			Collections.sort(list, Comparator.comparingInt(Book::getPrice));
//			break;
//		}
//		
//		case 2: {
//			Collections.sort(list, Comparator.comparingDouble(Book::getRating).reversed());
//			break;
//		}
//		
//		case 3: {
//			Collections.sort(list, Comparator.comparing(Book::getAuthor));
//			break;
//		}
//		
//		case 4: {
//			Collections.sort(list, Comparator.comparingInt(Book::getDiscount).reversed());
//			break;
//		}
//					
//	}
		
		Collections.sort(list, Comparator.comparingInt(Book::getPrice)
				.thenComparingDouble(Book::getRating)
				.thenComparing(Comparator.comparing(Book::getAuthor).reversed())
				.thenComparingInt(Book::getDiscount).reversed());
		
		for(Book b : list)
		{
			System.out.println(b);
		}
		
	}

}

//3
//501,ThePowerofHabit,550,4.6,CharlesDuhigg,20
//502,Sapiens,700,4.9,YuvalNoahHarari,10
//503,Outliers,650,4.8,MalcolmGladwell,15
