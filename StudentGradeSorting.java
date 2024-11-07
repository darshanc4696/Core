package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student
{
	String name;
	int grade;
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return name + "," + grade;
	}
}

public class StudentGradeSorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++)
		{
			String s = sc.nextLine();
			String[] ar = s.split("- ");
			
			list.add(new Student(ar[0].trim(), Integer.parseInt(ar[1].trim())));
			
		}
		
		Collections.sort(list, Comparator.comparingInt(Student::getGrade).reversed()
				.thenComparing(Comparator.comparing(Student::getName)));
		
		for(Student s:list)
		{
			System.out.println(s);
		}

	}

}

//4
//Alice - 85
//Bob - 90
//Charlie - 85
//David - 95
