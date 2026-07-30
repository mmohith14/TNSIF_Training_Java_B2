package org.tnsif.acc.c2tc.methodoverriding;

class Payment 
{
	void makePayment()
	{
		System.out.println("Proceesing payment using generic method");
		System.out.println("---------------------------------------");
		
	}
}

class UPIpayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using UPI");
	}
}

class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment mde using Credit/Debit card");
	}
}

class WalletPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment using WalletPayment");
	}
}

public class PaymentTest {

	public static void main(String[] args) {
		Payment payment;
		
		payment=new Payment();
		payment.makePayment();
		
		payment=new UPIpayment();
		payment.makePayment();
		
		payment=new CardPayment();
		payment.makePayment();
		
		payment=new WalletPayment();
		payment.makePayment();
		
	}

}
