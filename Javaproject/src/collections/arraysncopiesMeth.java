package collections;

import java.util.ArrayList;
import java.util.Collections;

public class arraysncopiesMeth {
	public static void main(String[] args) {
		ArrayList<String> intlist = new ArrayList<String>(Collections.nCopies(5, "welcome"));
		
		System.out.println("ArrayList items: "+intlist);
	}

}
