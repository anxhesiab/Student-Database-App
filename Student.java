package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance;
	private static int costofCourse = 600;
	private static int id = 1000;
	
	//Constructor user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sephore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextLine();
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);	
		
		
	}
	
	//Generate an ID 
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	
	public void enroll() {
		
		//Get inside a loop, user hits o
		do {
			
			System.out.print("Enter course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses+"\n" + course;
				tuitionBalance += costofCourse;
			}
			else
				break;
		}while(1 != 0);
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.print("TUITION BALANCE: " + tuitionBalance);
	}
	
	//View balance 
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//Pay tuition
	
	public void payTuition() {
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -=payment;
		System.out.println("\nThank you for your payment of $" + payment);
		System.out.println("\nYoure balance is: $" + tuitionBalance);
	}
	
	//Show status
	
	public String showInfo() {
		return  "\nName: "+firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
	}
}
