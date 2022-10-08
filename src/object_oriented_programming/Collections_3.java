package object_oriented_programming;

import java.util.*;

public class Collections_3 {

	public static void main(String[] args) {
		
		
		// Declaring the Vector
        Vector<Integer> v2 = new Vector<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            v2.add(i);
  
        // Printing elements
        System.out.println(v2);
  
        // Remove element at index 3
        v2.remove(3);
  
        // Displaying the Vector
        // after deletion
        System.out.println(v2);
  
        // Printing elements one by one
        for (int i = 0; i < v2.size(); i++)
            System.out.print(v2.get(i) + " ");

	}

}
