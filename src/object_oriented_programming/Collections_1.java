package object_oriented_programming;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections_1 {

	public static void main(String[] args) {	
		
		ArrayList<Object> list = new ArrayList<Object>(); // creating an array list of different data types 
		
		list.add("Brayan"); // adding elements 
		list.add(23);
		list.add(99);
			
		Iterator<Object> i = list.iterator();
			
		// using hasNext method
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
			
		list.remove(1);
		
		for(Object i1 : list)
		{
			System.out.println(i1);

		}
		
		
		list.add(2);
		for(Object i1 : list)
		{
			System.out.println(i1);

		}

	}
}


