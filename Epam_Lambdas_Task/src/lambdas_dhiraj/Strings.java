package lambdas_dhiraj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Strings {
	public static List<String> search(List<String> list) {
		return list
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<String> a1 = new ArrayList<String>();
		 a1.add("abc"); 
	        a1.add("aaa"); 
	        a1.add("bbb");
	        a1.add("abcd");
	        List<String> s = search(a1); 
	        System.out.println(s);
		 
            
		
	}
}