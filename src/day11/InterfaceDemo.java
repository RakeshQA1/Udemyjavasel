package day11;

interface Shape
{
	
	int s=10; //static and final by default when they are in interface
	int q=30; //static and final by default when they are in interface
	
	void circle();
	
	default void square() {
		System.out.println("This is squre");
		
	}
	static void rectange()
	{
		System.out.println("This is rectangle");
	}
	

}





public class InterfaceDemo implements Shape {


	public void circle() {
	 System.out.println("This is circle");
		
	}
	 public static void main(String[] args) {
		InterfaceDemo intd = new InterfaceDemo();
		intd.square();
		intd.circle();
		System.out.println(intd.q);
		System.out.println(intd.s);
	Shape.rectange();
	//Instance of a variable that holds Interface
	Shape intd1=new InterfaceDemo();
	intd1.square();
	intd1.circle();
	
	
	
	
	
		
	}
	
	

}
