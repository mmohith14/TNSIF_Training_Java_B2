package org.tnsif.acc.c2tc.oops;

class Course
{
	String courceName="Java Programming";
	 
	void showCourse()
	{
		System.out.println("Cource:"+courceName);
	}
}

class Student extends Course
{
	String studentName="Mohith M";
	
	void showStudent()
	{
		System.out.println("Student Name:"+studentName);
	}
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		Student student=new Student();
		student.showStudent();
		student.showCourse();

	}

}
