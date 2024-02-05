package day13;

public class FinallyBlock {
public static void main(String[] args) {
	
	String name=null;
	System.out.println("Programme is started");
	System.out.println("Programme is inprogress");
	try {
		//System.out.println(100/num);
		System.out.println(name.length());	
	} catch (Exception h) {
		System.out.println("exception handled");
		h.printStackTrace();
	}finally {
		System.out.println("Entered finally block");
	}
	System.out.println("Programme is cOMPLETED");
	System.out.println("Programme is exited");
	
	}
}

