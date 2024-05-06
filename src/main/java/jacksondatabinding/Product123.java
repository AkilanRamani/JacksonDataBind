package jacksondatabinding;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class Product123 {
	
	public String proId;      
   public Name proName;      
    public String price;  
    public String expire;  
    public String seller;  
      
    // constructor  
    Product123(String proId, String name, String code, String price, String expire){  
        this.proId = proId;  //1
        proName = new Name(name, code);  //1,1
        this.price = price;  //1
        this.expire = expire;  //12-09-7899
    }  
      
}  
// create class Name  
 
class Name {  
    public String name;  
    Name(String fName, String code){  
        name = fName+" ("+code+")";  
    }         
}  
@JsonIgnoreType  
class MixInForIgnoreType {}  

