package jacksondatabinding;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Product12 {
	private String proId;      
    private String name;      
    private String price;  
      
    @JsonSerialize(using = DateSerializer.class)  
    private Date expire;   
      
    //Getter and Setters  
    public String getProId() {    
        return proId;    
    }    
    public void setProId(String proId) {    
        this.proId = proId;    
    }    
    public String getName() {    
        return name;    
    }    
    public void setProName(String name) {    
        this.name = name;    
    }    
    public String getPrice() {    
        return price;    
    }    
    public void setPrice(String price) {    
        this.price = price;    
    }  
    public Date getDate() {    
        return expire;    
    }    
    public void setDate(Date expire) {    
        this.expire = expire;    
    }  
}
