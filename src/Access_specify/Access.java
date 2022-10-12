package Access_specify;

import object_oriented_programming.*;


public class Access extends Access_Modifiers {

	public static void main(String[] args) {
		Access obj  = new Access();
		
		Access_Modifiers obj1 = new Access_Modifiers();
		
		System.out.println("Acessing the public data from another package: " + obj1.bank_name);// Accessing public data is possible 
		//with or without inheritance.
		
		
		System.out.println("Acessing the protected data from another package: " + obj.account_number);// This is working because we use 
		//inheritance to inherit the base class in this package in line number 6. Without inheritance it won't work
		
		
		
		//System.out.println("Acessing the default data from another package: " + obj.de_fault); will lead to compilation error because 
		// the default data can be accessed only in the same package where it is defined.
		
		
	}

}