package collections;

import java.util.ArrayList;
import java.util.List;

public class arraylistex {
public static void main(String[] args) {
	List<String> obj = new ArrayList<String>();
	obj.add("Ajeet");
	obj.add("harry");
	obj.add("krishna");
	obj.add("ravi");
	obj.add("gopi");
	System.out.println("original ArrayList:");
	
	for(String str:obj)
System.out.println(str);
	obj.add(0, "Rahuel");
	obj.add(1, "justin");
	
	System.out.println("arry aftyer adding elemeents operation:");
	for(String str:obj)
		System.out.println(str);
	obj.remove("harry");
	obj.remove("ravi");
	System.out.println("ArrayList after remove operations:");
	for(String str:obj)
		System.out.println(str);
	
	obj.remove(1);
	System.out.println("final arrayList");
	for(String str:obj)
		System.out.println(str);
}
}
