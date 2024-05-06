package jacksondatabinding;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMain {

	public static void main(String[] args) throws JsonProcessingException {
		  ObjectMapper mapper = new ObjectMapper();
		    MyDto sto = new MyDto();
		    sto.setStringValue("a");

		    String dtoAsString = mapper.writeValueAsString(sto);
           System.out.println(dtoAsString);
		    
	}

}
