package Java8feactures;


import java.util.ArrayList;
import java.util.List;



public class TestSortingEx {
public static void main(String[] args) {
	List<EmployeeEx> listemp= getEmployee();
	System.out.println("before sorting ");
	for (EmployeeEx employeeEx : listemp) {
		System.out.println(employeeEx);
	}
	System.out.println("After sorting");
	listemp.sort((EmployeeEx o1, EmployeeEx o2)-> o1.getId()-o2.getId());
	listemp.forEach((employeeEx)->System.out.println(employeeEx));
	System.out.println("");
}


private static List<EmployeeEx> getEmployee(){
	List<EmployeeEx> result = new ArrayList<EmployeeEx>();
	result.add(new EmployeeEx(1, "krishna", 190039398.0));
	result.add(new EmployeeEx(2, "a", 190039398.0));
	result.add(new EmployeeEx(3, "krishna", 190039398.0));

	result.add(new EmployeeEx(6, "vdhdj", 190039398.0));
	result.add(new EmployeeEx(9, "shna", 190039398.0));
	result.add(new EmployeeEx(7, "ishna", 190039398.0));

	return result;
	
}
}
