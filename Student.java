package June2023paper2;

import java.util.Scanner;

public class Student {
	
	private int studentId;
	private String name;
	private String course;
	
	public Student() {
		
		this.studentId = (Integer) null;
		this.name = null;
		this.course = null;
		
		
	}

	public Student(int studentId, String name, String course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.course = course;
	}
	
	public void Read() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student ID : ");
		studentId=sc.nextInt();
		
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter the course : ");
		course = sc.nextLine();
	}
	
	public void Print() {
		
		System.out.print("Student ID : " + studentId);
		System.out.print(" Name : " + name);
		System.out.print("Course : " + course);
		
	}

}
