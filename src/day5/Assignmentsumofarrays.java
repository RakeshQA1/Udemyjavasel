package day5;

public class Assignmentsumofarrays {
public static void main(String[] args) {
	int v[]= {6,7,8,9};
	int sum=0;
	for (int i = 0; i < v.length; i++) {
		sum=sum+v[i]%10;
		//v[i]=v[i]/10;
	}
	System.out.println(sum);
}
}
