package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swaparraylist {
	public static void main(String a[])throws Exception{
	   
		   ArrayList<String> al = new ArrayList<String>();
	   
	    al.add("Sachin");
	    al.add("Rahul");
	    al.add("Saurav");
	    al.add("Sunil");
	    al.add("Kapil");
	    al.add("Vinod");

	    System.out.println("ArrayList before Swap:");
	    for(String temp: al)
	        System.out.println(temp);
	    try {
	    	   Collections.swap(al, 2, 17);
	    	   System.out.println("after swai performed");
	   	    for(String temp:al)
	   	    	System.out.println(temp);
		} catch (IndexOutOfBoundsException e2) {
		String  e3  =	e2.getMessage();
	
			System.out.println("entered wrong index "+e3);
		}
	
	   
	
	    
	    List<Integer> intli=new ArrayList<Integer>();
	    intli.add(76);
	    intli.add(76);
	    System.out.println("second arraylist");
	    for(Integer arrli:intli)
	    	System.out.println(arrli);

}}
