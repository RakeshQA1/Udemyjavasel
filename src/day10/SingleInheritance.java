package day10;
class A{
int a;
	
	void show() {
		System.out.println(a);
	}
	
}	
class B extends A{
	int b;
	void display() {
		System.out.println(b);
}
}


public class SingleInheritance {

public static void main(String[] args) {
	B be = new B();
		be.a=456;
		be.show();
		
		be.b=78;
		be.display();
		

 	}
	
	
	
}
