package day3;

public class Assignment1 {
public static void main(String[] args) {
	// 1) Largest of the two number
	/*int a=20,b=30;
	if (a>b) {
	
		System.out.println("The A is the largest number:"+a);
	} else {
     System.out.println("The b is the largest number:"+b);
	}*/
	
	
	
	//2) Largest number of 2 numbers using ternary
	/*int a=20,b=30;
	int c=a>b?a:b;
	System.out.println(c);*/
	
	
	
	//3)Smallest of the three numbers
	/*int a=30,b=10,c=20;
	if (a<b && a<c) {
		System.out.println("A is the smallest:"+a);
	} else if(b<a&&b<c) {
        System.out.println("B is the smallest:"+b);
	}else {
		System.out.println("C is the smallest:"+c);
	}*/
	
	int monthno=6;
	switch (monthno) {
	case 1: System.out.println("Jan");break;
	case 2: System.out.println("Feb");break;
	case 3: System.out.println("Mar");break;
	case 4: System.out.println("Apr");break;
	case 5: System.out.println("May");break;
	case 6: System.out.println("Jun");break;
	case 7: System.out.println("Jul");break;
	case 8: System.out.println("Aug");break;
	case 9: System.out.println("Sep");break;
	case 10: System.out.println("Oct");break;
	case 11: System.out.println("Nov");break;
	case 12: System.out.println("Dec");break;
	default: System.out.println("Invalid month number");
		break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
