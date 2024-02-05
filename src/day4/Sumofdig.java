package day4;

public class Sumofdig {
public static void main(String[] args) {
	int num=123456;
	int sum=0;
	while (num>0) {
		sum=sum+num%10; //6 //6+5=11 //11+4=15 //15+3=18 //18+2=20 //20+1=21
		num=num/10; //12345 //1234 //123 //12 //1
	}System.out.println("The sum of digits is:"+sum);
}
}
