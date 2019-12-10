package collections;

import java.util.ArrayList;
import java.util.List;

public class sublist {
  public static void main(String[] args) throws Exception {
	  try {
	List<String> lis=new ArrayList<String>();
	lis.add("k");
	lis.add("j");
	lis.add("i");
	lis.add("a");
	lis.add("h");
	lis.add("l");
	lis.add("a");
System.out.println("before sub list creating");
	for(String list:lis) 
		System.out.println(list);
	
	List<String> arrlis2=lis.subList(2, 5);
	System.out.println("sublist"+arrlis2);
}
  catch(IndexOutOfBoundsException e) {
	  System.out.println("Exception throw: "+e);
}
	  }
}