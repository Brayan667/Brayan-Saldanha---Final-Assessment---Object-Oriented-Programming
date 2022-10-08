package object_oriented_programming;

public class Throws {

	public static void main(String[] args) {
		int age = 10;
		int size  = 12;
		int arr[] = new int[size];
		arr[0] = 12;
		int k = 11;
		if(age<18) {
			throw new ArithmeticException("You are under age");
		}
		else if(k>size) {
			throw new IndexOutOfBoundsException ("Index is out of bounds");
			
		}
		else {
			System.out.println("Age and indexes are valid");
		}

	}

}
