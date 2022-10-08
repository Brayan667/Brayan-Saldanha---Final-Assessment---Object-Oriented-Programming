package object_oriented_programming;


	
	class Vehicle{
		void manufacturing_details() {
			System.out.println("150 Vehicles are being manufactured in the showroom");
		}
	}
	
	
	class Bikes extends Vehicle{
		void manufacturing_details() {
			System.out.println("Out of total vehicles, 60 are bikes!");
		}
	}
	
	public class Override {

	public static void main(String[] args) {
		  Vehicle obj1 = new Vehicle();
		  Bikes obj2 = new Bikes();
		  obj1.manufacturing_details();
		  obj2.manufacturing_details();
	}
	
	
};
	
	
	



