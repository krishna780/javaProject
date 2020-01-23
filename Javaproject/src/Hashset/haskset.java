package Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class haskset {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<String>();
	hset.add("Apple");
	hset.add("Apple");
	hset.add("pple");
	hset.add("ple");
	hset.add("le");
	hset.add(null);
    hset.add(null);
	hset.add("ple");
	hset.add("e");
	System.out.println(hset);
	
	Iterator<String> it=hset.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		System.out.println("--------------------"); 
		for(String tem : hset){
		System.out.println(tem);
		}
System.out.println("------------List convert--------------");
List<String> list = new ArrayList<String>(hset);
System.out.println(list);
	}
 
}
}
