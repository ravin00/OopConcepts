package June2023paper2;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
	
	private String CourseId;
	private String name;
	private String instructor;
	private ArrayList<Student> enrolledStudent;
	
	
	public Course () {
		this.CourseId = null;
		this.name = null;
		this.instructor = null;
	}

	public Course(String courseId, String name, String instructor) {
		super();
		CourseId = courseId;
		this.name = name;
		this.instructor = instructor;
	}
	
	public void Read() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Course Name : ");
		CourseId = sc.nextLine();
		
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter instructor : ");
		instructor = sc.nextLine();
		
		
	}
	
	
	
}
