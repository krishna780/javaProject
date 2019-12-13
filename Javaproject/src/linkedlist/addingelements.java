package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class addingelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList<String> list = new LinkedList<String>();
  list.add("ravi");
  list.add("hari");
  list.add("gopi");
  list.add("hari");
  list.add("priyanka");
  list.add("giri");
  for( String li:list)
	  System.out.println(li);
  list.add("jaen");
  list.add("gjkkk");
  list.add(3,"indexadd");
  list.addFirst("hindi");
  list.addLast("hin");
  System.out.println("After adding:: ");
  for(String lis:list)
	  
  System.out.println(lis);

	}

}
