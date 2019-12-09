package collections;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistSort1 {
	public static void main(String[] args) {
		ArrayList<Double> arraylist = new ArrayList<>();
		arraylist.add(10.4);
		arraylist.add(13.1);
		arraylist.add(1.4);
		arraylist.add(3.1);
		arraylist.add(20.4);
		arraylist.add(23.1);
		System.out.println("Before sorting: ");
		System.out.println("last index of: "+arraylist.indexOf(1.4));
   for(double str: arraylist) {
	   System.out.println(str);
   }
Collections.sort(arraylist);
 System.out.println("after sorting: ");
 
 for(double lasst:arraylist) {
	 System.out.println(lasst);
 }
 
 arraylist.add(56.6);
 arraylist.add(9.5);
 System.out.println("after adding: "+arraylist);
arraylist.remove(2);
Collections.sort(arraylist);
System.out.println(arraylist);
	}
	
	

}
