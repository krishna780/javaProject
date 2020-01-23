package linkedlist;

import java.util.LinkedList;

public class Getelefirst {
 public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<String>();
	
	li.add("ravi");
	li.add("krishna");
	li.add("kanth");
	li.add("kris");
	String lis=li.getFirst();
	System.out.println(lis);
	String li2=li.getLast();
	System.out.println(li2);
System.out.println(li.get(2));   

System.out.println("all names");
li.forEach(ele ->{
	System.out.println(ele);
});
}
}
