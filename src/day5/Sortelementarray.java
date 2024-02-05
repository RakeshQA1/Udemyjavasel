package day5;

import java.util.Arrays;
import java.util.Collections;

public class Sortelementarray {
public static void main(String[] args) {
	int a[]= {10,9,8,6,7,5,3,4,1,2};
	System.out.println("Print the number before sort:"+(Arrays.toString(a)));

	/*for (int i = 0; i < a.length-1; i++) {
	  for (int j = 0; j < a.length-1; j++) {
		if (a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}	
	}*/
	//2nd approach to sort the array elements with built in methods
	//Arrays.parallelSort(a);
	
	//3rd approach to sort the array elements with buit in methods
	//Arrays.sort(a);
	
	//Sort the elements in the descending order, for this to perform we need to change the datatype from 'int' to 'Integer'
	//Arrays.sort(a,Collections.reverseOrder());
	System.out.println("Print the numbers after the sort:"+(Arrays.toString(a)));
	
}
}
