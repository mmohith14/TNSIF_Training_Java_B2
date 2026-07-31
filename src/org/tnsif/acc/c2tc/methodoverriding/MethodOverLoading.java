package org.tnsif.acc.c2tc.methodoverriding;


class A
{
	int add(int a1,int a2)
	{
		return a1+a2;
	}
    double add(double a, double b)
    {
    	return a+b;
    }
    int add (int a, int b,  int c)
    {
    	return a+b+c;
    }
}

public class MethodOverLoading {

	public static void main(String[] args) {
		A a=new A();
		System.out.println("Two integers sum "+a.add(1, 3));
		System.out.println("Three integres sum "+a.add(3, 6,8));
		System.out.println("Two double datatype sum "+a.add(3.5,5.6));
		
	}

}
