package object_oriented_programming;

// This program explains the concept of abstract classes. An abstract class can't be 
//instantiated and it's methods can only be implemented in the subclass. Only the method definition will be in abstract class.

abstract class Abstract_class{
	abstract void abs();
}

public class Abstract extends Abstract_class{
	public static void main(String[] args) {
		
		 
		Abstract obj = new Abstract();
		obj.abs();

	}
	
	void abs() {
		System.out.println("Abstract method in a abstract class is defined inside the inherited class");
	}

}
