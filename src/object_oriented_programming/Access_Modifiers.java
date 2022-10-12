package object_oriented_programming;

class Bank_details{
	private int card_pin = 22;//private
	protected int account_number  = 44;//protected
	public int bank_name = 88;//public
	int IFSC_code = 100;//default
	
	void print() {
		System.out.println("Accessing the private variable from the same class: " + card_pin);
		//Private data can be accessed only within the base class
	}}

 class User extends Bank_details{
	void print() {
		System.out.println("Accessing the protected data from the sub class " + account_number);
		//Protected data can be accessed within the package and outside it only using inheritance
		
		
		//System.out.println("Accessing the private data from the sub class " + pri_vate) not possible
		
		
		System.out.println("Accessing the default data from the sub class " + IFSC_code);// Can be accessed in only the same package
		
	}}
 
public class Access_Modifiers extends User{

	public static void main(String[] args) {
		Bank_details obj1 = new Bank_details();
		//System.out.println("Accessing private data by using object of the same class in other class " + obj1.pri_vate);
		User obj2 = new User();
		System.out.println("Accessing protected data by using object of the sub class in other class " + obj2.account_number);
		System.out.println("Accessing public data from other class " + obj1.bank_name);
		System.out.println("Accessing default data: " + obj2.IFSC_code);
		//System.out.println("Accessing the private variable from the same class: " + obj1.pri_vate); private data can be accessed only
		// from the class where it was defined. not outside it
		}}
