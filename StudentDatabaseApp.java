package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		
		//Ask how many new students we want
		System.out.println("Enter number of new students to entroll");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new students
		for (int n = 0; n< numOfStudents; n++) {
			System.out.println(students[n].showInfo());
		}
		for (int n = 0; n< numOfStudents; n++) {
			System.out.println(students[n].showInfo());
		}
	}
}
