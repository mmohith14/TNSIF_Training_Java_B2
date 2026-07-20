package org.tnif.acc.c2tc.javabasics;

public class variable {
	int price=10;
	void print()
	{
		String msg ="hello";
		System.out.println("msg");
	}
	static String message="hello students";
	
	public static void main(String [] args)
	{
		variable obj=new variable();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
		
	}

}