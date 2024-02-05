package day5;

import java.util.Arrays;

public class Sigledimearray {
public static void main(String[] args) {
	
	//Declare the variable 
	/*int a[]=new int[15];
	a[0]= 20;
	a[1]=30;*/
	//2nd method we can initialize the variable by directly storing multiple values
	int a[]= {20,30,40,50,60,70}; 
	//1st approach to directly print the all the values in the a array
	//System.out.println(Arrays.toString(a));
	
	//2nd approach using for loop to print the all values in a
	/*for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}*/
	//using enhance for loop to perform the same print
	for (int xa : a) {
		System.out.println(xa);
	}
	
}
}
