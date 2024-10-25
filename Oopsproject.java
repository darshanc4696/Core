package corejava;

import java.util.Scanner;


class MenuItem
{
	protected int itemId;
	protected String itemName;
	protected float price;
	protected String category;
	
	public MenuItem() {
	}

	public MenuItem(int itemId, String itemName, float price, String category) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		
		return "ItemId: "+itemId+"\n"+"itemName: "+itemName+"\n"+"price: "+price+"\n"+"category: "+category+"\n";
	}
	
}

class Factory
{
	static Scanner scan = new Scanner(System.in);
	
	public static MenuItem getMenuIem(String choice)
	{
		if(choice.equalsIgnoreCase("Beverages"))
		{
			System.out.println("Enter the Menu Item:");
			String s= scan.next();
			String[] ar = s.split(",");
			
			int itemId = 101;
			String itemName = ar[0];
			float price = Float.parseFloat(ar[1]);
			String category = ar[2];
			float caffeineContent = Float.parseFloat(ar[3]);
			
			Beverages b = new Beverages(itemId, itemName, price, category, caffeineContent);
			
			return b;
		}
		else if(choice.equalsIgnoreCase("MainCourse"))
		{
			System.out.println("Enter the Menu Item:");
			String s= scan.next();
			String[] ar = s.split(",");
			
			int itemId = 101;
			String itemName = ar[0];
			float price = Float.parseFloat(ar[1]);
			String category = ar[2];
			float calories = Float.parseFloat(ar[3]);
			String cuisineType = ar[4];
			
			MainCourse c = new MainCourse(itemId, itemName, price, category, calories, cuisineType);
			
			return c;
		}
		else
		{
			return null;
		}
		
	}
}


class Beverages extends MenuItem
{
	protected float caffeineContent;
	
	public Beverages() {	
	}
	
	public Beverages(int itemId, String itemName, float price, String category, float caffeineContent)
	{
		super(itemId, itemName, price, category);
		this.caffeineContent = caffeineContent;
	}

	public float getCaffeineContent() {
		return caffeineContent;
	}

	public void setCaffeineContent(float caffeineContent) {
		this.caffeineContent = caffeineContent;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"caffeineContent: "+caffeineContent;
	}
	
	
}


class MainCourse extends MenuItem
{
	protected float calories;
	protected String cuisineType;
	
	public MainCourse() {
	}

	public MainCourse(int itemId, String itemName, float price, String category, float calories, String cuisineType) {
		super(itemId, itemName, price, category);
		this.calories = calories;
		this.cuisineType = cuisineType;

	}

	public float getCalories() {
		return calories;
	}

	public void setCalories(float calories) {
		this.calories = calories;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"calories: "+calories+"\n"+"cuisineType: "+cuisineType;
	}
}


public class Oopsproject
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your choice\nBeverages\nMainCourse\n");
		
		String choice = scan.next();
		
		
		MenuItem item = Factory.getMenuIem(choice);
		System.out.println(item);


	}
	
}


























































