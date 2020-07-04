package lambdas_dhiraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StaticMethod {
	public static void main(String[] args) {
        List<String> a = Arrays.asList("aba","aaa","abba","dhiraj","acdf","dhirajvullanki","abcddcba","avdc","abcdef");
        List<String> palindromes = StaticMethod.findPal(a, 
                (str) -> StaticMethod.isPal((String) str));
 
        System.out.println("The Palindromes" + palindromes);
    }
 
    public static boolean isPal(String str) {
    	StringBuffer newStr =new StringBuffer();
    	for(int i = str.length()-1; i >= 0 ; i--) {
    	newStr = newStr.append(str.charAt(i));
    	}
    	if(str.equalsIgnoreCase(newStr.toString())) {
    		return true;
    	} else {
    		return false;
    	}
        } 
    public static List<String> findPal(List<String> list, Predicate<String> predicate) { 
    	List<String> sortedpal = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            sortedpal.add((String) i);
        });
        return sortedpal;
 
    }
    
}
