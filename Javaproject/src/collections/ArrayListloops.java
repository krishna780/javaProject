package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListloops {
 public static void main(String[] args) {
	ArrayList<Integer> arrlist = new ArrayList<Integer>();
	
    arrlist.add(15);
    arrlist.add(7);
    arrlist.add(39);
    System.out.println("For loop");
    for(int i=0; i<arrlist.size(); i++) {
    	System.out.println(arrlist.get(i));
    }
    System.out.println("advanced for Loop");
    for(Integer num:arrlist) {
    	System.out.println(num);
    }
    System.out.println("while loop");
    int c=0;
    while(arrlist.size()>c) {
    	System.out.println(arrlist.get(c));
    	c++;
    }
    System.out.println("Iterator");
    Iterator iter=arrlist.iterator();
    while(iter.hasNext()) {
    	System.out.println(iter.next());
    }
}
}
