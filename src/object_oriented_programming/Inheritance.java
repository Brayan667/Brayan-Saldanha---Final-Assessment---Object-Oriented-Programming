package object_oriented_programming;

// This program depicts multilevel inheritance. Here the father class inherits grandfather, and the child class inherits father

class grandfather {
	int grandfather_age  = 78;
	String grandfather_name  = "Albert";
}

class father extends grandfather {
	int father_age = 45;
	String father_name = "Richard";	
}


class child extends father {
	 int child_age = 22;
	 String child_name = "Brayan";	
}

public class Inheritance {

	public static void main(String[] args) {
		  father obj1 = new father();
		  child obj2 = new child();
		  
		  
		  System.out.println("Details acessed through subclass - father via inheritance" );
		  System.out.println(obj1.father_age);
		  System.out.println(obj1.father_name);
		  System.out.println(obj1.grandfather_age);
		  System.out.println(obj1.grandfather_name);
		  
		  System.out.println("Details acessed through subclass - child via inheritance" );
		  System.out.println(obj2.child_age);
		  System.out.println(obj2.child_name);
		  System.out.println(obj2.father_age);
		  System.out.println(obj2.father_name);
		  System.out.println(obj2.grandfather_age);
		  System.out.println(obj2.grandfather_name);	  
	}
}
