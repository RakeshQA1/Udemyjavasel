package day8;

public class Greetingsmain {
public static void main(String[] args) {
	Greetings gr = new Greetings();
	gr.greetings1();
	String tr = gr.greetings2();
	System.out.println(tr);
	gr.greetings3("Tima");
	int grs = gr.greetings4(8);
	System.out.println(grs);
	//Greetings.tjk();
}
}