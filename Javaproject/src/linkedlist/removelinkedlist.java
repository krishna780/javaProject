package linkedlist;

import java.util.LinkedList;

public class removelinkedlist extends Exception {
public static void main(String[] args) {
	LinkedList<Integer> lis= new LinkedList<Integer>();
	lis.add(9);
	lis.add(16);
	lis.add(75);
	lis.add(32);
	lis.add(276);
	System.out.println("linked list elements are");
	for(int li:lis)
		System.out.println(li);

	lis.remove(Integer.valueOf(32));

	System.out.println("After remove first element");
	Object obj=lis.removeFirst();
	System.out.println(obj);
	System.out.println(lis);
	System.out.println("after last first element");
	Object obj1=lis.removeLast();
	System.out.println(obj1);
	System.out.println(lis);
	System.out.println("removing first occurence");
	Object list=lis.removeFirstOccurrence(lis);
	System.out.println(list);
	System.out.println(lis);
	Object l=lis.removeLastOccurrence(lis);
	System.out.println(l);
	lis.removeAll(lis);
	lis.clear();
	System.out.println(lis);

}
}
