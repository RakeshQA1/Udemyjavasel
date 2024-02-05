package day5;

import java.util.Arrays;

public class Searcharrayelements {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	//Search array with key values
	int key=2; //key
	boolean flag=false;
	int l=0;
	int h=a.length-1;
	//1st approach to search array elements using while and if loop
	/*while (l<=h) {
		int m=(l+h)/2;
		if (a[m]==key) {
			System.out.println("Element found");
			flag=true;
			break;
			
		} else if(a[m]<key)
		{
          l=m+1;
		}
		else if(a[m]>key) 
		{
			h=m-1;
		}
	}*/
	//2nd approach to search array elements using built in methods
	
	System.out.println(Arrays.binarySearch(a, 8));
	
}
	
	
	
}
