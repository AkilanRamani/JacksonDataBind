package jacksondatabinding;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MixInAnnotationExample{

	  public static void main(String args[]) {  
          
	        // create an instance of ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	        ObjectMapper mapper1 = new ObjectMapper();  
	          
	        // create Scanner class object  
	        Scanner sc= new Scanner(System.in);       
	          
	        // using try-catch for serializing Product  
	        try {  
	              
	            Product123 product;  
	              
	            String proId, proName, proPrice, proExpiry, proCode;  
	              
	            System.out.println("Enter Product Id:");  
	            proId = sc.nextLine();  
	              
	            System.out.println("Enter Product Name");  
	            proName = sc.nextLine();  
	              
	            System.out.println("Enter Product Code");  
	            proCode = sc.nextLine();  
	              
	            System.out.println("Enter Product Price");  
	            proPrice = sc.nextLine();  
	              
	            System.out.println("Enter Product Expiry in dd-mm-yyyy format");  
	            proExpiry = sc.nextLine();  
	              
	            // set values to Student object by using constructor  
	            product = new Product123(proId, proName, proCode, proPrice, proExpiry);     
	            
	            String str = mapper  
	                .writerWithDefaultPrettyPrinter()  
	                .writeValueAsString(product);  
	            System.out.println("The str is " + str);  
	              
	         ObjectMapper map =   mapper1.addMixIn(Name.class, MixInForIgnoreType.class);  
	            str = map  
	                .writerWithDefaultPrettyPrinter()  
	                .writeValueAsString(product);  
	            System.out.println("The string JSON " + str);  
	        }  
	        catch (IOException e) {   
	            e.printStackTrace();  
	        }  
	          
	        //close Scanner class object  
	        sc.close();  
	          
	    }  
	
}
