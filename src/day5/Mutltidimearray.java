package day5;

public class Mutltidimearray {
public static void main(String[] args) {
	//First approach to store mutli dime arrays
	
	/*int [][]av= new int[13][13];
	av[0][0]=25;
	av[0][1]=30;
	av[5][0]=35;
	System.out.println(av[5][0]);*/
	
	
	//2nd approach to store multi dime arrays
	int ab[][]= {{56,67,78,89},{90,91,92,93},{94,95,96,97}};
	 //Print multi dime values using for loop
	/*for (int i = 0; i < ab.length; i++) {
		for (int j = 0; j < ab[i].length; j++) {
			System.out.print(ab[i][j]+" ");
		}
		System.out.println();
	}*/
	
	//Print multi dime values using enhanced for loop
	for (int[] is : ab) {
		for (int is2 : is) {
			System.out.print(is2+" ");
		}System.out.println();
	}
	
	
	
	
	
	
}
}
