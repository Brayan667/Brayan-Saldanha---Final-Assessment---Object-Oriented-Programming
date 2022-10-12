package object_oriented_programming;

// This program depicts multilevel inheritance. Here the father class inherits grandfather, and the child class inherits father

class General_Hospital {
	int general_hospital_medicines  = 78;
	String general_hospital_name  = "Father Mullers Hospital";
}

class Clinic extends General_Hospital {
	int clinic_medicines = 50;
	String clinic_name = "James Clinic";	
}


class NGO extends Clinic {
	 int NGO_medicines = 22;
	 String NGO_name = "Community camp";	
}

public class Inheritance {

	public static void main(String[] args) {
		  Clinic obj1 = new Clinic();
		  NGO obj2 = new NGO();
		  
		  
		  System.out.println("Details acessed through subclass - father via inheritance" );
		  System.out.println(obj1.clinic_medicines);
		  System.out.println(obj1.clinic_name);
		  System.out.println(obj1.general_hospital_medicines);
		  System.out.println(obj1.general_hospital_name);
		  
		  System.out.println("Details acessed through subclass - child via inheritance" );
		  System.out.println(obj2.NGO_medicines);
		  System.out.println(obj2.NGO_name);
		  System.out.println(obj2.clinic_medicines);
		  System.out.println(obj2.clinic_name);
		  System.out.println(obj2.general_hospital_medicines);
		  System.out.println(obj2.general_hospital_name);	  
	}
}
