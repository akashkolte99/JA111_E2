package Problem2;

import java.util.Scanner;

public class Demo {
	
	void displayDetails() {
		Student s = new Student();
		System.out.println(s.getRoll());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getMarks());

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Students : ");
		int n = sc.nextInt();
		
		Student [] stud  = new Student[n];
		
		for(int i=0;i<stud.length;i++) {
			System.out.println("Enter Details Of Student "+ (i+1));
			System.out.println("Enter Roll No : ");
			int roll = sc.nextInt();
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter Address : ");
			String address =sc.next();
			System.out.println("Enter Mrks Of Student ");
			int mark = sc.nextInt();
			
			System.out.println("=====================");
			
			stud[i]= new Student(roll,name,address,mark);
			
	        
		}
		
//		for(int i=0;i<stud.length;i++) {
//		Student s1 = new Student ();
//		}
		
		int sum = 0;
		for(int j=0;j<stud.length;j++) {
			System.out.println("=================");
			System.out.println("Student Roll No : "+ stud[j].getRoll());
			System.out.println("Student Name : "+stud[j].getName());
			System.out.println("Student Address: "+stud[j].getAddress());
			System.out.println("Student Marks : "+stud[j].getMarks());
			sum=sum+stud[j].getMarks();
			System.out.println("==================");
		}

		System.out.println("Average of Students Marks is = " + sum/n);
	}
	
	
}

