package day8;

public class ConstructorOverloading {

	int x,y,z;
	String i;
	
	
	
 ConstructorOverloading() {
	x=20;
	y=30;
	z=40;
	i="Tima";
System.out.println(x+y+z+i);
}
ConstructorOverloading(int a,int b)
{
	x=a;
	y=b;
	System.out.println(x+y);
	
}
	ConstructorOverloading(int a, String d)
	{
		x=a;
		i=d;
		System.out.println(x+i);
	}
	ConstructorOverloading(String d, int a,int b)
	{
		i=d;
		x=a;
		y=b;
		System.out.println(x+y+i);
		
	}
	
	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(30, 40);
		new ConstructorOverloading(3, "Tom");
		new ConstructorOverloading("Trio", 3, 4);
	}
	
}
