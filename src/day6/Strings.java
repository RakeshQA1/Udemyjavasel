package day6;

public class Strings {
public static void main(String[] args) {
	String s="welcome";
	//String s1=new String("welcome");
	System.out.println(s.length());
	String s2= "Welcome";
	/*String s3= "to java";
	String s4="Automation";
	System.out.println(s2+s3);
	System.out.println(s2.concat(s3));
	System.out.println(s2.concat(s3).concat(s4));
	s="     Automation  ";
	
//trim
	System.out.println(s.trim());
	System.out.println(s.length());
	System.out.println(s.trim().length());*/
	
	//charAt
	System.out.println(s.charAt(3));
	
	//contains
	System.out.println(s.contains("wel"));
	//equals
	System.out.println(s.equals(s2));
	//equalsignorecase
	System.out.println(s.equalsIgnoreCase(s2));
	//replace
	System.out.println(s.replace("w", "s"));
	//substring
	System.out.println(s.substring(0, 4));
	//split
	String s5="abcd@gmail.com";
	String a[]=s5.split("@");
	System.out.println(a[0]);
	System.out.println(a[1]);
	//touppercase
	System.out.println(s.toUpperCase());
	//tolowercase
	System.out.println(s.toLowerCase());
	
	
}
}
