package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptions {
public static void main(String[] args) {
	/*System.out.println("Programme is started");
	System.out.println("Programme is inprogress");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
		int num = sc.nextInt();
	try {
		System.out.println(100/num);	
	} catch (ArithmeticException e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("Arithmetic error");
	}
	
	System.out.println("Programme is cOMPLETED");
	System.out.println("Programme is exited"); */
	
	//Example 2
	int a[]=new int[5];
	System.out.println("Programme is started");
	System.out.println("Programme is inprogress");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num");
		int num = sc.nextInt();	
	System.out.println("Enter the position between 0 to 4");
	int pos = sc.nextInt();
	try {
		a[pos]=num;
		System.out.println(a[pos]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("AOI error");
		e.printStackTrace();
	}
	
	System.out.println("Programme is cOMPLETED");
	System.out.println("Programme is exited");
	
	
}
}
