package day10;

class ABC
{
	void m1(int a)
	{
	System.out.println(a);	
	}
	void m2(int b)
	{
		System.out.println(b);
	}
	
}
class XYZ extends ABC
{
	void m1(int a) //overrided
	{
	System.out.println(a*a);	
	}
	void m2(int b,int c) //overloaded
	{
		System.out.println(b+c);
	
	}
	
}




public class OverridingvsOverloading {
public static void main(String[] args) {
	XYZ xy=new XYZ();
	xy.m1(23);
	xy.m2(34);
	xy.m2(56, 67);
}
	

	
	
}
