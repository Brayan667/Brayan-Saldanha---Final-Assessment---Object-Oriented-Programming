package object_oriented_programming;

// This program explains the concept of abstract classes. An abstract class can't be 
//instantiated and it's methods can only be implemented in the subclass. Only the method definition will be in abstract class.

abstract class Bank{
	abstract void deposit(); //making a deposit as a abstract class. The definition of this is available in the main class
	void withdrawal () { //Withdrawal can be done from any bank atm
		System.out.println("Please withdraw the money");
	}
}

public class Abstract extends Bank{
	public static void main(String[] args) {
		Abstract user = new Abstract();
		user.deposit(); //user is depositing the money
	}
	
	void deposit() { //this is the deposit method
		System.out.println("Abstract method in a abstract class is defined inside the inherited class");
	}

}
