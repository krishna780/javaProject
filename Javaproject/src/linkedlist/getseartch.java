package linkedlist;

import java.util.LinkedList;

public class getseartch {
	public static void main(String[] args){
	     LinkedList<String> linkedlist = new LinkedList<String>();
	     linkedlist.add("Tim");
	     linkedlist.add("Rock");
	     linkedlist.add("Hulk");
	     linkedlist.add("Rock");
	     linkedlist.add("James");
	     linkedlist.add("Rock");
	     
	    
	     int firstindex=linkedlist.indexOf("Rock");
	     System.out.println(firstindex);
	     int lastindex = linkedlist.lastIndexOf("Rock");
	     System.out.println(lastindex);
	     Object firstelement=linkedlist.getFirst();
	     System.out.println(firstelement);
	     Object lastelement =linkedlist.getLast();
	     System.out.println(lastelement);
	    try { 
	     Object get=linkedlist.get(6);
	    }
	    catch (IndexOutOfBoundsException e) {
			System.out.println("index enter propearly::::"+e.getMessage());
		}
	    
	    list sublist=linkedlist.subList(1, 4);
	     System.out.println("list of items:::::::");
	     for(String lis: linkedlist )
	    	 System.out.println(lis);
	}

}
