package day10;

class Bank
{
	String color="Black";
	
	int roi()
	{
		return 13;
	}
}
class IOB extends Bank
{
	int roi()
	{
		return 11;
	}
	
}

class Axis extends Bank
{	
 int roi()
	{
		return 10;
	}
	
}



public class OverridingDemo {
	public static void main(String[] args) {
		Axis ax = new Axis();
		System.out.println(ax.roi());
		
		IOB io = new IOB();
		System.out.println(io.roi());

	}
}
