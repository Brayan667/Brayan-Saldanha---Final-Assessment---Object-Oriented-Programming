package object_oriented_programming;

class Access_Modify{
	private int pri_vate = 22;//private
	protected int pro_tected = 44;//protected
	public int pub_lic = 88;//public
	int de_fault = 100;//default
	
	void print() {
		System.out.println("Accessing the private variable from the same class: " + pri_vate);
		//Private data can be accessed only within the base class
	}}

 class Access_mod extends Access_Modify{
	void print() {
		System.out.println("Accessing the protected data from the sub class " + pro_tected);
		//Protected data can be accessed within the package and outside it only using inheritance
		
		
		//System.out.println("Accessing the private data from the sub class " + pri_vate) not possible
		
		
		System.out.println("Accessing the default data from the sub class " + de_fault);// Can be accessed in only the same package
		
	}}
 
public class Access_Modifiers extends Access_mod{

	public static void main(String[] args) {
		Access_Modify obj1 = new Access_Modify();
		//System.out.println("Accessing private data by using object of the same class in other class " + obj1.pri_vate);
		Access_mod obj2 = new Access_mod();
		System.out.println("Accessing protected data by using object of the sub class in other class " + obj2.pro_tected);
		System.out.println("Accessing public data from other class " + obj1.pub_lic);
		System.out.println("Accessing default data: " + obj2.de_fault);
		//System.out.println("Accessing the private variable from the same class: " + obj1.pri_vate); private data can be accessed only
		// from the class where it was defined. not outside it
		}}
