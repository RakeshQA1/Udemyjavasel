package day12.package1;

import day12.Test;

public class Testingmain //extends Test 
{
public static void main(String[] args) {
	//Testingmain t2=new Testingmain();
//Protected method can be called from across or different  packages via the inheritance and extend keyword
	//t2.m2();
//System.out.println(t2.z);
	Test t3=new Test();
	t3.m3();
	System.out.println(t3.a);
}
}
