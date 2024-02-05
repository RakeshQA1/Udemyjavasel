package day4;

public class Countnumofdig {
public static void main(String[] args) {
	int t=1234567;
	
	int count=0;
	while (t>0) {
		t=t/10;
		count++;
	}
	
	System.out.println("The count of the odd dig:"+count);
	
}
}
