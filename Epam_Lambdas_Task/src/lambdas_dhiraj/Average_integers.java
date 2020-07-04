package lambdas_dhiraj;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average_integers {

	 public static void main(String[] args) 
	    {
	        IntStream stream = IntStream.of(2, 3, 3, 4, 6, 7, 8,9); 
	        OptionalDouble obj = stream.average(); 
	        if (obj.isPresent()) { 
	            System.out.println(obj.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}
