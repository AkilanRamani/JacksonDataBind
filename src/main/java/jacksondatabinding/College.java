package jacksondatabinding;

import com.fasterxml.jackson.annotation.JsonProperty;

public class College {
	
    private String name;        
    private String university;     
    private String address;   
    private String rank;     
      
    // default constructor   
    College(){  
          
    }  
      
    // constructor    
    College(String name, String university, String address, String rank){    
        this.name = name;    
        this.university = university;    
        this.address = address;    
        this.rank = rank;    
    }    
    @JsonProperty("name")    
    public String getCollegeName() {    
        return name;    
    }  
    public void setCollegeName(String name) {    
        this.name = name;    
    }  
    @JsonProperty("university")    
    public String getUniversityName() {    
        return university;    
    }  
    public void setUniversityName(String university) {    
        this.university = university;  
    }  
    public String getAddress() {    
        return address;    
    }  
    public void setAddress(String address) {    
        this.address = address;    
    }  
    public String getRank() {    
        return rank;    
    }  
    public void setRank(String rank) {    
        this.rank = rank;    
    }  

}
