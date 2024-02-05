package day10;

class C
{
	int c;
	void display()
	{
		System.out.println(c);
	}
}
class D extends C
{
	int d;
	void show()
	{
		System.out.println(d);
	}
}
class E extends D
{
	int e;
public static void rag() {
		System.out.println("raghu");
	}
	void see()
	{
		System.out.println(e);
	}
}

public class MultilevelInheritance {
public static void main(String[] args) {
	E mu = new E();
	mu.c=100;
	mu.display();
	mu.d=200;
	mu.show();
	mu.e=300;
	mu.see();
	
	
	
	
	
}
}
