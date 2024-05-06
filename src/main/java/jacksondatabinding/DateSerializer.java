package jacksondatabinding;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class DateSerializer  extends StdSerializer<Date> {  
    
  // declare and initialize serialVersionUID  
  private static final long serialVersionUID = 1L;   
  private static SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");  
    
  // default and parameterized constructor  
  public DateSerializer() {   
      this(null);  // THIS Refers to the parent class constructor.  
  }  
  public DateSerializer(Class<Date> t) { //accepts the Date Type as the parameter.   
      super(t);   
  }  
    
  // override serialize method  
  
@Override
public void serialize(Date value, JsonGenerator gen, SerializerProvider provider) throws IOException {
	 gen.writeString(sdf.format(value)); 
	
}}

