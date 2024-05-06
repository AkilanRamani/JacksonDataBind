package jacksondatabinding;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyDto {
	 private String stringValue;

	    public MyDto() {
	        super();
	    }
	    @JsonProperty("strVal12")
	    public String getStringValue() {
	        return stringValue;
	    }

	    public void setStringValue(String stringValue) {
	        this.stringValue = stringValue;
	    }
}
