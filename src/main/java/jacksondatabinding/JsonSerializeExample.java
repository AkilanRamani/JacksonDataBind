package jacksondatabinding;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializeExample {

	public static void main(String[] args) throws ParseException {
		ObjectMapper obj = new ObjectMapper(); 
       // InjectableValues values = new InjectableValues.Std().addValue(int.class, stdId);   

        
        // create instance of SimpleDateFormat class to format a date  
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");   
          
        Scanner sc1 = new Scanner(System.in);  
          
        try {  
              
            Product12 prod = new Product12();  
            String prodId, prodName, price;  
            Date exp;  
              
            System.out.println("Enter Product Id:");  
            prodId = sc1.nextLine();  
            prod.setProId(prodId);  
              
            System.out.println("Enter Product Name");  
            prodName = sc1.nextLine();  
            prod.setProName(prodName);  
              
            System.out.println("Enter Product Price:");  
            price = sc1.nextLine();  
            prod.setPrice(price);  
              
            System.out.println("Enter expiry date of product in dd-MM-yyyy format:");  
            exp = sdf.parse(sc1.nextLine());  
            prod.setDate(exp);  
              
            String jsonString = obj  
                .writerWithDefaultPrettyPrinter()  
                .writeValueAsString(prod);  
            System.out.println(jsonString);  
              
        } catch (JsonParseException e) {  
            e.printStackTrace();  
        } catch (JsonMappingException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }   
    }  

	}


