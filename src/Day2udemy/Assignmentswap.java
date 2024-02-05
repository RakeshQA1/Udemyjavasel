package Day2udemy;

public class Assignmentswap {
public static void main(String[] args) {
	int a=10,b=30;
	
	//Logic 1
	
	/*int c=a;
	 a=b;
	 b=c;
	System.out.println("After the swap:"+a+" "+b);*/
	
	
	//Logic2 - no need to add another variable
	
	/*a=a+b; //40
	b=a-b; //10
	a=a-b; //30
	System.out.println("After the swap:"+a+" "+b); */
	
	//Logic 3 -no need to add another variable
	
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After the swap:"+a+" "+b);
	
	
	
	
	
}
}
