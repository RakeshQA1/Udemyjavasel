package day4;

import java.util.Scanner;

public class Assignmentreverseinput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number");
	//int rev=0;
	int num = sc.nextInt();
	/*while (num!=0) {
		rev=rev*10+num%10; //0+1234%10=4 40+123%10=43 430+12%10=2 4320+1%10=
		num=num/10; //123 //12 //1
	}*/
	//2ND approach using stringbuffer
	/*StringBuffer sb = new StringBuffer(String.valueOf(num));
	StringBuffer rev = sb.reverse();
	*/
	//3rd approach using Stringbuilder
	StringBuilder sbl = new StringBuilder();
	sbl.append(num);
	StringBuilder rev = sbl.reverse();
	System.out.println("Reverse num is:"+rev);
	
}
}
