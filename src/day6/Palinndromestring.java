package day6;

import java.util.Scanner;

public class Palinndromestring {
public static void main(String[] args) {
	System.out.println("Please enter the string input");
	Scanner sc = new Scanner(System.in);
	String st = sc.next();
	String bc = st;
	int len=st.length();
	String rev="";
	for (int i = len-1; i>=0; i--) {
		rev=rev+st.charAt(i);
	}
	//to check palindrome
	if (rev.equals(bc)) {
		System.out.println("Its an palindrome");
	} else {
       System.out.println("Its not an palindrome");
	}
}
}
