package Java8feactures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreanMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alpha = Arrays.asList("a", "b", "d", "s");
		List<String> alp = new ArrayList<String>();
		for (String string : alpha) {
			alp.add(string.toUpperCase());
		}
		System.out.println(alpha);
		System.out.println(alp);
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
