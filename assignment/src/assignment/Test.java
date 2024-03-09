package assignment;

import java.util.Scanner;

public class Test extends Student{
	
	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		
		CollegeStudent cStudent1 = new CollegeStudent(2101, 85.14, 3);
		CollegeStudent cStudent2 = new CollegeStudent(2102, 72.56, 5);
		
		SchoolStudent sStudent1 = new SchoolStudent(3101, 89.45, "4th");
		SchoolStudent sStudent2 = new SchoolStudent(3102, 64.25, "6th");
		SchoolStudent sStudent3 = new SchoolStudent(3103, 75.21, "9th");
		
		students[0] = cStudent1;
		students[1] = cStudent2;
		students[2] = sStudent1;
		students[3] = sStudent2;
		students[4] = sStudent3;
		
		for(Student student : students) {
			student.show();
			
			System.out.println();
			
		}
		
		
		Scanner sc = new Scanner(System.in);
		int searchRollNo = sc.nextInt();
		
		for(Student student : students) {
			if(student.rollNo == searchRollNo) {
				if(student instanceof CollegeStudent) {
					System.out.println("Found College Student with roll no.: " + searchRollNo);
				}else if(student instanceof SchoolStudent) {
					System.out.println("Found School Student with roll no.: " + searchRollNo);
				}else {
					System.out.println("No student found with roll no.:" + searchRollNo);
				}
			}
		}
		int countA=0;
		for(Student student : students) {
			if(student.percentage>75) {
				countA++;
			}
		}
		System.out.println("Number of students with A grade = " + countA);
		
	}

}
