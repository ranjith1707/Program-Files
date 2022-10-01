package demo;

abstract class Mobile{

	abstract void osVersion();
	
	void findVersion() {
		osVersion();
	}
}

public class Apple extends Mobile {

	
	
	public static void main(String[] args) {
		Apple iphone=new Apple();
		iphone.mobilePhoneVersion();
		
	}
	void mobilePhoneVersion() {
		findVersion();
	}
	
	void osVersion() {
		System.out.println("  A13  bionic Chip");
		
	}
   
}