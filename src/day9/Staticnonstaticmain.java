package day9;

public class Staticnonstaticmain {
	public static void main(String[] args) {
		//1)Static methods can access static stuff directly without object
		//System.out.println(a);//incorrect bcz b is a non static variable
		System.out.println(Staticnonstatic.b); //static variable
		Staticnonstatic.m1();
		//m2() -----> we cant call non static method without object

		Staticnonstatic stno = new Staticnonstatic();
		stno.m2();
		System.out.println(stno.a);
		stno.b=60;

}
}
