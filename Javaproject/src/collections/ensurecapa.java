package collections;

import java.util.ArrayList;

public class ensurecapa {
 public static void main(String[] args) {
	 ArrayList<String> al = new ArrayList<String>();
     //Added 4 elements
     al.add("H");
     al.add("lo");
     al.add("B");
     al.add("M");
     System.out.println("first arraylist ");
     for(String temp:al)
    		System.out.println(temp);
    	
     ArrayList<String> clone = (ArrayList<String>)al.clone();
	ArrayList<String> al2 = clone;
     al2.add("Hi");
     al2.add("Hello");
     al2.add("Bye");
     al2.add("GM");
     System.out.println(al2);
      al2.removeAll(al2);
  	System.out.println("second arraylist ");

	System.out.println(al2.isEmpty());
 for(String temp:al2)
	System.out.println(temp);
}
}