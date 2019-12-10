package collections;

import java.util.ArrayList;
import java.util.List;

public class addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           List<Integer> arraylist = new ArrayList<Integer>();
           arraylist.add(12);
           arraylist.add(25);
           arraylist.add(32);
           arraylist.add(54);
           arraylist.add(9);
           System.out.println("Printing list: ");
           for(Integer number:arraylist)
        	   System.out.println("Number = "+number);
           
           List<Integer> arrList2 = new ArrayList<Integer>();
           arrList2.add(23);
           arrList2.add(4);
           arrList2.add(98);
           arrList2.add(49);
           arrList2.add(65);
           System.out.println("second list: ");
           for (Integer num:arrList2)
        	   System.out.println(num);
arraylist.addAll(arrList2);
           System.out.println("Printing all the elements:");
         for (Integer number:arraylist)
        	 System.out.println("Number = "+number);


	}

}
