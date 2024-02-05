package day6;

import java.util.Iterator;

public class Reversestring {
public static void main(String[] args) {
String s="pqrst";
String rev="";
int len=s.length();
for (int i = len-1; i>=0; i--) {
	rev=rev+s.charAt(i);
}
System.out.println(rev);

//StringBuffer s1 = new StringBuffer(s);
//System.out.println(s1.reverse());

}
}
