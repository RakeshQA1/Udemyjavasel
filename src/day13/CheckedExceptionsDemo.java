package day13;

import java.util.Scanner;

public class CheckedExceptionsDemo {
	public static void main(String[]args) throws InterruptedException {
		System.out.println("Programme is Started");
		System.out.println("Programme is inprogress");
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		Thread.sleep(5000);
		System.out.println("Programme is cOMPLETED");
	System.out.println("Programme is exited");
	}
}
