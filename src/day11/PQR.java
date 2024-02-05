package day11;

public class PQR extends MNO implements ABC,XYZ{

	
	public void m1() {
		System.out.println("This is m1 from ABC");
		System.out.println(length);
		
	}
	public void m2() {
		System.out.println("This is m2 from XYZ");
		System.out.println(width);
		System.out.println(z);
	}
public static void main(String[] args) {
	PQR in = new PQR();
	in.m1();
	in.m2();
	in.m3();
	
}


}
