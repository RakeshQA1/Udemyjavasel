package day14;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
	/*1)Heterogenous data- allowed
	2)Insertion order- not preserved
	3)it accepts duplicate
	
	4) multiple nulls- allowed */
	public static void main(String[] args) {
		//HashMap hm = new HashMap();
		//Map hm = new HashMap();
		Map<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "Ramesh");
		hm.put(102, "latin");
		hm.put(103, "Ramesh");
		hm.put(104, null);
		hm.put(101, "hari");
		hm.put(105, null);
		System.out.println(hm); //101=hari, 102=latin, 103=Ramesh, 104=null
		System.out.println(hm.size());
		//get values using key
		System.out.println(hm.get(102));
		//get all the keys
		System.out.println(hm.keySet());
		//remove pair values
		hm.remove(104);
		System.out.println("After removing:"+ hm);
		//read data
		for (Object x : hm.keySet() ) {
			System.out.println(x+"   "+hm.get(x));
		}
		
		hm.clear();
		System.out.println(hm);
	}
}
