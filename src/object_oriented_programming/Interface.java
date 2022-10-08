package object_oriented_programming;

// This program demonstrated the concept of interfaces , used to achieve abstractions in programs. Multiple inheritance in Java 
//is possible due to interfaces

interface inter_1{
	void inter_1_method();
}


interface inter_2{
	void inter_2_method();
}

public class Interface implements inter_1,inter_2 {

	public static void main(String[] args) {
		   Interface obj = new Interface();
		   obj.inter_1_method();
		   obj.inter_2_method();
	}
	
	
	public void inter_1_method() {
		System.out.println("This abstract method in interface inter_1 is implemented in the sub class");
	}
	
	

	public void inter_2_method() {
		System.out.println("This abstract method in interface inter_2 is implemented in the sub class");
	}

}
