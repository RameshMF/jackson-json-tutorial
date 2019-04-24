package net.javaguides.jackson.ignore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreTypeTest {
	
	public static void main(String[] args) throws JsonProcessingException {
		UserDTO.Name name = new UserDTO.Name("John", "Doe");
		UserDTO user = new UserDTO(1, name);
	 
	    String result = new ObjectMapper()
	      .writeValueAsString(user);
	    
	    System.out.println(result);
	}
}

