package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;

public class NameCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
        char ch=scan.next().charAt(3);
        System.out.println("Fourth character is:"+ch);
	}

}
