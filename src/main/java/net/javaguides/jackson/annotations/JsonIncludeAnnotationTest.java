package net.javaguides.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonIncludeAnnotationTest {
	public static void main(String[] args) throws JsonProcessingException {

		// Create ObjectMapper object.
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		Employee employee = new Employee(10, null, "");
		String result = mapper.writeValueAsString(employee);

		System.out.println(result);

	}
}
