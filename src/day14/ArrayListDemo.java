package day14;

import java.util.ArrayList;
import java.util.List;
/*1)Heterogenous data- allowed
2)Insertion order- preserved
3)Duplicate elements -allowed
4) multiple nulls- allowed */

public class ArrayListDemo {
	
public static void main(String[] args) {
	//List<String> al = new ArrayList<String>();
	List al= new ArrayList();
	
al.add("Thiru");
al.add(233);
al.add(23.45);
al.add(true);
al.add(233);
al.add(null);
al.add(null);
 //Print values inside the arraylist
System.out.println(al);
//Size of an arraylist
System.out.println(al.size());

//remove one of the data from arraylist
al.remove(2);
//print the values of an array after removing one of the data
System.out.println("After removing a elements:"+ al);
//insert a new element in the middle of an array
al.add(3, "Laddu");
System.out.println("After insertion:" +al);
//to get a single value from array
System.out.println(al.get(1));
//To clear data from the array list

for (Object x : al) {
	System.out.println(x);
}

al.clear();
System.out.println("After clearing the data:"+ al);




}
	
}
