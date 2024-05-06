package jacksondatabinding;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ChangeNameOfFieldExample {

	public static void main(String[] args) {
		 ObjectMapper mapper = new ObjectMapper();    
		  
	        String json = "{\"name\":\"ABES\",\"university\":\"AKTU\", \"address\":\"NH-24 Highway GZB UP\", \"rank\":\"1\"}";    
	             
	        // de-serializing Json into Java object    
	        College colg;  
	        try {  //de-serialization.
	            colg = mapper.readerFor(College.class).readValue(json);  //
	              
	            // print id, name and course of student    
	            System.out.println(colg.getCollegeName());    
	            System.out.println(colg.getUniversityName());    
	            System.out.println(colg.getAddress());  
	            System.out.println(colg.getRank());  
	              
	        } catch (JsonMappingException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        } catch (JsonProcessingException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	    }    

	}


