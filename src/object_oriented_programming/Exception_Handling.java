package object_oriented_programming;

public class Exception_Handling {

	public static void main(String[] args) {
		 int arr[] = new int[2]; // Dynamically declaring an array
		 
		 
		 try {
		 arr[4] = 12/0;
		 }
		 catch(ArithmeticException t){
			 System.out.println("Divide by zero error!!");
		 }
		 catch(IndexOutOfBoundsException i) {
			 System.out.println("Array index is out of bounds");
		 }
		 finally {
			 System.out.println("The try catch block is executed");
		 }
	}

}
