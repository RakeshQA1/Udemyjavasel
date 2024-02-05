package day9;


public class Staticnonstatic {
int a=1;
static int b=10,c=30;
static void m1() {
	System.out.println("m1");
	//System.out.println(a); //static would not accept non static variables and methods
    
}
void m2() {
    System.out.println(b);
	m1();
	System.out.println("m2");
}




public static void main(String[] args) {
//1)Static methods can access static stuff directly without object
//System.out.println(a);//incorrect bcz b is a non static variable
System.out.println(b); //static variable
m1();
//m2() -----> we cant call non static method without object

Staticnonstatic stno = new Staticnonstatic();
stno.m2();
System.out.println(stno.a);
stno.b=60;



}



}
