package day4;

public class Countdifofoddeven {
public static void main(String[] args) {
	long num=23456789111l;
	int oddco=0;
	int evenco=0;
	while (num>0) {
		long re=num%10;
		if (re%2==0) {
		evenco++;
		}else {
		oddco++;
		}num=num/10;
	}
System.out.println("The digit of even no is:"+oddco);
System.out.println("The digit of odd no is:"+evenco);
	
} 
}
