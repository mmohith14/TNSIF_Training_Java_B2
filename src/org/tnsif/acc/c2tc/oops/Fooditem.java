package org.tnsif.acc.c2tc.oops;

public class Fooditem {

	String name;
	double price;
	String category;
	
	
	void displayDetail()
	{
		System.out.println("Food name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Category:"+category);
		System.out.println("=================");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fooditem fooditem1=new Fooditem();
		fooditem1.name="Biryani";
		fooditem1.price=299.99;
		fooditem1.category="Rice";
		
		Fooditem fooditem2=new Fooditem();
		fooditem2.name="Pizza";
		fooditem2.price=399.99;
		fooditem2.category="Fast food";
		
		fooditem1.displayDetail();
		fooditem2.displayDetail();
		
		
		
		
	}

}
