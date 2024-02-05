package day3;

public class Largestofthree {
public static void main(String[] args) {
	int a=500,b=300,c=100;
	if (a>b && a>c) {
		System.out.println("A is greater than B and c");
	} else if(b>a && b>c){
    System.out.println("B is grater than A and C");
	}else {
System.out.println("C is greater than A and B");
}
}
}