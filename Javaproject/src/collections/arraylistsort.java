package collections;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistsort {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(11);
		arraylist.add(16);
		arraylist.add(112);
		arraylist.add(163);
		arraylist.add(131);
		arraylist.add(186);
		System.out.println("Before Sorting:");
		for(int cou:arraylist) {
			System.out.println(cou);
		}
		Collections.sort(arraylist);
	System.out.println("After Sorting:");
	for(int cou: arraylist) {
		System.out.println(cou);
	}
	}

}
