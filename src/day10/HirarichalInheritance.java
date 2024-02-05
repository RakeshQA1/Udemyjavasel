package day10;

 class F
 {
int f=300;
void dis()
{
	System.out.println(f);
}
	 
 }
class G extends F
{
	int g=400;
	void sh()
	{
		System.out.println(g);
	}
	
}
class H extends F
{
	int h=500;
	void pr()
	{
		System.out.println(h);
	}
	
	
}
class J extends F
{
	int j=600;
	void showj()
	{
		System.out.println(j);
	}
}

public class HirarichalInheritance {
public static void main(String[] args) {
	
	J je=new J();
	je.dis();
	je.showj();
	//je.pr(); //cannot call this method since it has no connection with class H
	
	
}
	
	
	
}
