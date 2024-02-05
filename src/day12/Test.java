package day12;

public class Test {
private int x=13;
private void m() {
	System.out.println("This is private m");
}
 int y=23; //default variable
 void m1() { //default method
	System.out.println("This is m1 degault method");
}

protected int z=56;
protected void m2()
{
	System.out.println("This is protected m2");
}

public int a=300;
public void m3()
{
	System.out.println("This is m3 public method");
}



	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.x); //private variable we can call only this class
		t.m(); //private method we can call only this class
	}
	
	
	
	
}
