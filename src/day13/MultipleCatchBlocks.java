package day13;

import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[]args ) {
	System.out.println("Programme is inprogress");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	//int num = sc.nextInt();
	String name=null; 
	/*try {
		//System.out.println(100/num);
		System.out.println(name.length());	
	} catch (ArithmeticException e) {
		System.out.println("Arithmetic error");
	}catch (NumberFormatException f) {
		System.out.println("Number format error");
	}catch (NullPointerException g) {
		System.out.println("Null error");
	//g.printStackTrace();
	}
	 */
	
	
	try {
		//System.out.println(100/num);
		System.out.println(name.length());	
	} catch (Exception h) {
		System.out.println("Error thrown handled");
		h.printStackTrace();
	}
	System.out.println("Programme is cOMPLETED");
	System.out.println("Programme is exited");
	
	}
}
