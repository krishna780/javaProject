package collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
          
	public static void main(String[] args) {
		List<Integer> alist =new ArrayList<>();
		alist.add(10);
		System.out.println(alist);
		alist.add(25);
		System.out.println(alist);
		
		alist.remove(0);
		System.out.println(alist);
		
	}
}
