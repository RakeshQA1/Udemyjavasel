package day8;

public class Thiskeyword {
int x,y;
	//void sur() {
		//x=20;
		//y=30;
		//System.out.println(x+y);
	//}
	/*void sur(int x,int y)
	{
		this.x=x;
		this.y=y;
//System.out.println(x+y);
	}*/

 Thiskeyword(int x,int y) {
	this.x=x;
	this.y=y;
}
	void dis()
	{
	System.out.println(x);
	System.out.println(y);
	}
	
	
	
	public static void main(String[] args) {
		Thiskeyword cv = new Thiskeyword(10, 50);
		//cv.sur(10, 20);
		cv.dis();
	}
	
}
