package org.bank;

public class BankInfo extends AxisBank {

	private void saving() {
 
		System.out.println(" saving is 22 lakhs");
		
		
		
		
	}
	
	private void fixed() {
System.out.println("fixed deposit money is 11 lakhs");
	}
	
	public static void main(String[] args) {
		
		BankInfo a = new BankInfo();
		
		a.fixed();
		a.saving();
		a.deposit();
		
		
		
		
		
	}
	
	
	
}
