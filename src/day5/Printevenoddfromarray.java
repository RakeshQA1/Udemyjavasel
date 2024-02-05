package day5;

public class Printevenoddfromarray {
public static void main(String[] args) {
	int a[]= {1,2,4,5,6,7};
	System.out.println("Print the only even number");
	/*for (int i = 0; i < a.length; i++) {	
	 	if (a[i]%2==0) {
			System.out.println(a[i]);
		}
		
}*/
	//System.out.println("Print the only odd number");
	/*for (int i = 0; i < a.length; i++) {
		if (a[i]%2!=0) {
			System.out.println(a[i]);
		}
	}*/
	
	for (int value : a) {
		if (value%2==0) {
			System.out.println(value);
		}
	}
	
	
	
	
}
}
