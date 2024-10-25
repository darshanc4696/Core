package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employee(){	
	}
	
	
	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+department+" "+salary;
	}
	
	@Override
	public int compareTo(Employee e2) 
	{
		Employee e1=this;
		
		Integer id1 = e1.id;
		Integer id2 = e2.id;
		
		int x = id1.compareTo(id2);
		return x;
	}

}



public class PracticeComparable {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		
		System.out.println("Enter number of Employees");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			Employee e = new Employee();
			System.out.println("Enter the details "+i+"st"+" "+"Employee");
			String input = scanner.next();
			String[] arr = input.split(",");
			
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setDepartment(arr[2]);
			e.setSalary(Integer.parseInt(arr[3]));
			
			ar.add(e);
		}
		scanner.close();

		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
	}

}
