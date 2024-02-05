package day14;


import java.util.HashSet;
import java.util.Set;
/* 1)Heterogenious data -->allowed
 * 2)Insertion order -->Not preserved (Index not supported)
 * 3) Duplicate elements -->Not allowed
 * 4) Multiple nulls not allowed/ only single null is allowed
 */

public class HashSetDemo {
public static void main(String[] args) {
	//Set<Integer> hs = new HashSet<Integer>();
	
	Set hs = new HashSet();
	hs.add(100);
	hs.add("Mallipoo");
	hs.add("Ranga");
	hs.add("Mallipoo");
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	//size of elements
	System.out.println(hs.size());
	//get specific values from the set is not possible ex. hs.get()
	//Remove values
	hs.remove("Ranga");
	System.out.println("After remove:" +hs);
	//Insertion is not possible in set
	//Read or print all the elements
	for (Object x : hs) {
		System.out.println(x);
	}
	
	
	
}
}
