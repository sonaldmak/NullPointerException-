import java.util.Optional;

public class demo{
	 public static void main(String[] args) 
	    { 
	  
	        // Create a String of size 100 
	        String[] a = new String[100]; 
	        // Add optional class
	        Optional<String> check = Optional.ofNullable(a[1]); 
	  
	        //If value is null, it will return false, else true 
	        if (check.isPresent()) { 
	  
	           
	            String upcase = a[1].toUpperCase(); 
	            System.out.print(upcase); 
	        } 
	        else
	  
	            // current value is null 
	            System.out.println("String value is not present"); 
	    } 
	
}