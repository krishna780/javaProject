package Java8feactures;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx {
public static void main(String[] args) {
	
         List<EmployeeEx> result = Arrays.asList(
    		new EmployeeEx(1, "krishna", 190039398.0),
    		new EmployeeEx(2, "a", 190039398.0),
    		new EmployeeEx(3, "krishna", 190039398.0),

    		new EmployeeEx(6, "vdhdj", 190039398.0),
    		new EmployeeEx(9, "shna", 190039398.0),
    		new EmployeeEx(7, "ishna", 190039398.0)) ;
    List<Staffpublic> res=result.stream().map(temp->{
    	Staffpublic obj = new Staffpublic(null, 0);
    	obj.setName(temp.getName());
    	obj.setId(temp.getId());
    	if ("a".equalsIgnoreCase(temp.getName())) {
			obj.setName("krishna");
		}
    	return obj;
    }).collect(Collectors.toList());
    System.out.println(res);
}
}
