package corejava;
import java.util.*;

class Course
{
	private String course;
	private String instructor;
	
	public Course(String course, String instructor) {
		super();
		this.course = course;
		this.instructor = instructor;
	}

	public Course() {
		super();
	}

	public String getCourse() {
		return course;
	}

	public String getInstructor() {
		return instructor;
	}

}

public class CourseInstructorSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Course> cou = new ArrayList<Course>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++)
		{
			String s = sc.nextLine();
			String[] ar = s.split("-");
			String course = ar[0];
			String instructor = ar[1];
			
			cou.add(new Course(course, instructor));
			
		}
		
		cou.sort(Comparator
				.comparing(Course::getInstructor).reversed()
				.thenComparing(Course::getCourse));
		
		for(Course c : cou)
		{
			System.out.println(c.getCourse()+" , "+c.getInstructor());
		}
		

	}

}
