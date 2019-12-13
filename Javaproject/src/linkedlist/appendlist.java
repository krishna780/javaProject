package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class appendlist {
	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(0);
		li.add(9);
		li.add(16);
		System.out.println(li);
		List<Object> lis=new ArrayList<Object>();
		lis.add(12);
		lis.add(89);
		lis.add(25);
		lis.add(47);
		lis.add(90);
		System.out.println(lis);
		System.out.println("After adding ");

		System.out.println(li);

	}

}
