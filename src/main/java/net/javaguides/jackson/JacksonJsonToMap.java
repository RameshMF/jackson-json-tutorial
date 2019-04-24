package net.javaguides.jackson;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonJsonToMap {
	public static void main(String[] args) throws IOException {
	      
	      ObjectMapper mapper=new ObjectMapper();
	      mapper.enable(SerializationFeature.INDENT_OUTPUT);
	      
	      String json="{" + 
	            "  \"THU\" : 5," + 
	            "  \"TUE\" : 3," + 
	            "  \"WED\" : 4," + 
	            "  \"SAT\" : 7," + 
	            "  \"FRI\" : 6," + 
	            "  \"MON\" : 2," + 
	            "  \"SUN\" : 1" + 
	            "}";

	      @SuppressWarnings("unchecked")
	      Map<String, Integer> days = mapper.readValue(json, Map.class);

	      for (Entry<String, Integer> day : days.entrySet()) {
	         System.out.println(day.getKey() + "=" + day.getValue());
	      }
	   }
}
