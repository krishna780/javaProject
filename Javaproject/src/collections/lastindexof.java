package collections;

import java.util.ArrayList;

public class lastindexof {
	public static void main(String[] args) 
    { 
  
        // creating an Empty Integer ArrayList 
        ArrayList<Integer> arr = new ArrayList<Integer>(7); 
  
        // using add() to initialize values 
        arr.add(10); 
        arr.add(20); 
        arr.add(30); 
        arr.add(40); 
        arr.add(30); 
        arr.add(30); 
        arr.add(40); 
  
        System.out.println("The list initially " + arr); 
        int element= arr.lastIndexOf(30);
        if(element != -1)
        	System.out.println("The lastIndexof of "+"30 is"+element);
        else 
        	System.out.println("30 is not present in index");
        element =arr.lastIndexOf(60);
        if(element!=-1)
        	System.out.println("the last index of 100"+element);
        else
        	System.out.println("100 is not present in list");
    }
}
