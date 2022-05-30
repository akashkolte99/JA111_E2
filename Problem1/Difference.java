package Problem1;

public class Difference {

//	Is-A relationship :- it is also a inheritance the classes which inherit are known as subclasses or child classes 
//	like in inheritance or in is - A relation ship is called a parent child relatiuonship
//	
//	and like our life we have some properties similar to our parent as we take it form them directly as same in is A relationship 
//	child class have all the properties which parent class posses .
	
//	example
	
	class Animal{
		void eat () {
			System.out.println("Parent method");
		}
	}
	
	class Dog extends Animal{
		void fun() {
			System.out.println("child Method");
			
		}
		
		public  void main(String[] args) {
			Animal a = new Dog();
			a.eat();
//			so now we can  access the parent properties inside child
		}
	}
	
//	has-A relationship :- it is a coposition like we can posses other classes from a single classes without any parent child 
//	relation we use has A relationship quit regular .
	
//	exapmle 

	public static void main(String[] args) {
		Student s = new Student();
//		here we can access it directly
//		
	}
	
//	there are Four type of access modifires :
//	1. Public 
//	2.Default 
//	3.protected
//	4.private
	
//	public : - public we can access from any where is the type of method or class is public 
//	Default : - if did not assigned the type of modifires to method or class or varables its directly posses default 
//	it is accesible only inside the package
	
//	protected :  - this modifire we use to protect our data from code to not get easily . it is also use up to a package level;
	
//	private :- this modifre we use for security of code or the data this is only accisible by getter and setter and also .
}