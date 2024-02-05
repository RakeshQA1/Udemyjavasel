package Day2udemy;

public class Operators2 {
public static void main(String[] args) {
	//3)Logical operators && -->AND || -->OR ! -->NOT
	
	//boolean ba=true;
	//boolean bb= false;
	
	boolean ba=10>1;
	boolean bb=1>10;
			
	
	System.out.println(ba &&bb);
	System.out.println(ba||bb);
	System.out.println(!ba);
	
	//4)Increment and decrement operator
	int a = 10;
	//a++;
	//a++;
	//a=a+1;
	System.out.println(a);
	
	//int b=a++;
	//System.out.println(b);
	//System.out.println(a);
	
	//int bac=++a;
	//System.out.println(bac);
	
	//Decremental operators --
	
	int na=10;
	//na--; //Post decremental
	//--na; //pre decremental
	
	/*int rest= na--;
	System.out.println(rest);
	System.out.println(na);*/
	
	int boost = --na;
	System.out.println(boost);
	
	
	
	
	
	
}
	
	
}
