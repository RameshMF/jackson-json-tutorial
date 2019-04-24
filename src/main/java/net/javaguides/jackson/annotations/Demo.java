package net.javaguides.jackson.annotations;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Demo {
	public static void main(String[] args) throws IOException {

		// Create ObjectMapper object.
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		User bean = new User(1, "Ramesh", "Fadatare", "Ramesh Fadatare");
		String result = mapper.writeValueAsString(bean);

		System.out.println(result);
	}
}
