package object_oriented_programming;

class over_loading_area{
	
	// This class contains 3 functions named area. Depending upon the parameters, they will perform area calculation of square, rectangle and circle
	void area(int side) {
		System.out.println("Area of the square with side " + side + " is: " + side*side);
	}
	
	
	
	
	void area(int length, int breadth) {
		System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + 2*(length+breadth) );
	}
	
	
	
	void area(int radius, String cirle) {
		System.out.println("Area of circle with radius " + radius + " is: " + 2*3.14*radius);
	}
}



public class Overloading {

	public static void main(String[] args) {
		  over_loading_area obj = new over_loading_area();
		  obj.area(12);
		  obj.area(2,4);
		  obj.area(22,"circle");
	}

}
