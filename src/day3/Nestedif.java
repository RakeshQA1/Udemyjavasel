package day3;

public class Nestedif {
	public static void main(String[] args) {
		if (true) {
			if (false) {
				System.out.println("Abc");
			} else if(false) {
				System.out.println("def");
			} else if(true) {
				System.out.println("Ghi");
			}
		} else {
			System.out.println("Jkl");
		}
	}
}
