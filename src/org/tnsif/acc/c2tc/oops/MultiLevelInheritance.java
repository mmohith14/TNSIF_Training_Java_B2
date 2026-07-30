package org.tnsif.acc.c2tc.oops;

class Device
{
	void deviceType()
	{
		System.out.println("I am an Electronic Device ,,,,");
		
	}
}
class Phone extends Device
{
	void brand() 
	{
		System.out.println("Brand:Samsung");
	}
}
class Smartphone extends Phone
{
	void features()
	{
		System.out.println("Features:Touchscreen,Camera,Internet");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Smartphone smart = new Smartphone();
		smart.deviceType();
		smart.brand();
		smart.features();

	}

}
