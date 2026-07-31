package org.tnsif.acc.c2tc.methodoverriding;

class students
{
	String name;
	int age;
	
	students ()
	{
		System.out.println("Default constructor");
		System.out.println("-------------------");

	}
	students(String name)
	{
		this.name=name;
		System.out.println("Name:"+name);
	}
	students(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name:"+name + "|Age:"+age);
		
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
      new students();
      new students("Mohith");
      new students("Manu",18);

	}

}
