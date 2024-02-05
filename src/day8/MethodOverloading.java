package day8;

public class MethodOverloading {
int x,y,z;
double i;

	
	
	void sum()
{
	        x=200;
			y=300;
			
			System.out.println(x+y);
}
	
	void sum(int a,int b, int c)
	{
		x=a;
		y=b;
		z=c;
		System.out.println(x+y+z);	
	}
	void sum(int a,double d)
	{
		x=a;
		i=d;
		System.out.println(x+i);
	}
	void sum(double d,int a)
	{
		i=d;
		x=a;
			System.out.println(i+x);	
	}
	void sum(double d,int a,int b)
	{
		x=a;
		y=b;
		i=d;
		System.out.println(x+y+i);
	}
	
	public static void main(String[] args) {
		MethodOverloading meth = new MethodOverloading();
		meth.sum();
		meth.sum(3.8, 7);
		meth.sum(5, 5.4);
		meth.sum(6.7, 8, 8);
		
	}
	
	
}
