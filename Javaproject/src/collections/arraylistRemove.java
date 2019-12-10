package collections;

import java.util.ArrayList;
import java.util.List;

import multiThreading.start;

public class arraylistRemove {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("AA");
		a1.add("bb");
		a1.add("Abc");
		a1.add("AkbA");
		a1.add("Ac");
		a1.add("cc");
		System.out.println("ArrayList before remove:");
		for(String lis:a1)
			System.out.println(lis);
	a1.add("kr");
	a1.add(4,"el");
	a1.remove("AA");
	a1.remove("Ac");
	a1.remove(3);
	boolean b=a1.remove("cc");
	System.out.println("Element AA removed:" +b);
	System.out.println("arraylist after remove:");
	for (String var2:a1)
		System.out.println(var2);
	
	
	}

}
