package day8;

public class Constructordemo {
 int x,y;
 double z;
	Constructordemo() {
	 x=200;
	 y=300;
	 z=3.95;
	}
	 void show()
	 {
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
	 }
	 Constructordemo(int a,int b,double c)
	 {
		x=a;
		y=b;
		z=c;
	 }
			
	 public static void main(String[] args) {
		 //Constructordemo cs = new Constructordemo(2,3,5.6); we are invoking default constructor
		Constructordemo cs = new Constructordemo(2,3,5.6);
		cs.show();
		
	}
	 
}
