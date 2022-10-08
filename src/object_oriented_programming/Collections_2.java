package object_oriented_programming;


import java.util.LinkedList;


public class Collections_2 {

	public static void main(String[] args) {
		
        LinkedList<String> l1 = new LinkedList<String>();
 
        // Adding elements to the linked list
        l1.add("Brayan");
        l1.add("Abhishek");
        l1.addLast("Jayanth");
        l1.addFirst("Krittika");
        l1.add(2, "Adarsh");
         
        System.out.println(l1); // printing the linked list
  
        //removing an element can be done by element name or index
        l1.remove("Brayan");
        l1.remove("Adharsh");
        l1.remove(3);
        l1.removeFirst();
        l1.removeLast();
 
        System.out.println(l1);
	}

}
