package net.javaguides.jackson;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonJsonToSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		// Create ObjectMapper object.
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		String json = "[ \"C\", \"C++\", \"Java\", \"Java EE\", \"Python\", \"Scala\", \"JavaScript\" ]";
		
		Set<String> progLangs = new HashSet<>();
		progLangs = mapper.readValue(json, Set.class);
		
		for (Iterator<String> iterator = progLangs.iterator(); iterator.hasNext();) {
			String progLang = (String) iterator.next();
			System.out.println(progLang);
		}
	}
}
