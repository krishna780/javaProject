package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Employees implements Iterable<Object>{
private ArrayList<Object> emps = null;
	
	public Employees(){
		emps = new ArrayList<Object>();
		emps.add(new Employee(1001,"Rams","Lead", 250000L));
		emps.add(new Employee(1002,"Posa","Dev", 150000L));
		emps.add(new Employee(1003,"Chinni","QA", 150000L));
	}
	
	@Override
	public Iterator<Object> iterator() {
		return emps.iterator();
	}

}

