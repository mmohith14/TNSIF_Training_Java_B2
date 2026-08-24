package org.tnsif.acc.c2tc.exceptionhandling;

public class ArrayIndexOutOfBoundExeceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]=new int[4]; //4 pos start=0 end =3
			try {
				int i= arr[5];
		        System.out.println(i);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
	}

}
