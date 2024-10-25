package corejava;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


class ImplComparator implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1, Employee1 e2) 
	{
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		
		int x = id1.compareTo(id2);
		return x;
	}

}

class Employee1
{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employee1(){	
	}
	
	
	public Employee1(int id, String name, String department, int salary) {
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

}



public class PracticeComparator{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		ImplComparator i1 = new ImplComparator();
		
		TreeSet<Employee1> ts = new TreeSet<Employee1>(i1);
		
		System.out.println("Enter number of Employees");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			Employee1 e = new Employee1();
			System.out.println("Enter the details "+i+"st"+" "+"Employee");
			String input = scanner.next();
			String[] arr = input.split(",");
			
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setDepartment(arr[2]);
			e.setSalary(Integer.parseInt(arr[3]));
			
			ts.add(e);
		}
		scanner.close();

		System.out.println(ts);
		
	}

}
