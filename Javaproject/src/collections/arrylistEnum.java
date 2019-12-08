package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class arrylistEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> arrylist=new ArrayList<String>();
     arrylist.add("c");
     arrylist.add("java");
     arrylist.add("c++");
     arrylist.add(".net");
     arrylist.add("python");

Enumeration<String> e=Collections.enumeration(arrylist);
System.out.println("ArrayList elements: ");
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
	}

}
