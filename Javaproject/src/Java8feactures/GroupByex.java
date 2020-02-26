package Java8feactures;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByex {
	public static void main(String[] args) {
		List<EmployeeEx> result = Arrays.asList(new EmployeeEx(1, "krishna", 190039398.0),
				new EmployeeEx(2, "a", 190039398.0), new EmployeeEx(3, "krishna", 190039398.0),
				new EmployeeEx(6, "vdhdj", 190039398.0), new EmployeeEx(9, "shna", 190039398.0),
				new EmployeeEx(7, "ishna", 190039398.0));
		Map<String, List<EmployeeEx>> groupByPriceMap = result.stream()
				.collect(Collectors.groupingBy(EmployeeEx::getName));
		System.out.println(groupByPriceMap);
	}
}
