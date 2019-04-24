package net.javaguides.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

/**
 * Write JSON from file using JsonGenerator
 * @author Ramesh Fadatare
 *
 */
public class WriteJsonUsingJsonGenerator {

	public static void main(String[] args) throws IOException {
		JsonFactory factory = new JsonFactory();

		// Create JsonGenerator
		JsonGenerator generator = factory.createGenerator(new File("post.json"), JsonEncoding.UTF8);

		// Creating JSON Oject
		generator.writeStartObject(); // Start with left brace i.e. {

		// Add string field
		generator.writeNumberField("id", 100);
		generator.writeStringField("title", "Jackson JSON API Guide");
		generator.writeStringField("description", "Post about Jackson JSON API");
		generator.writeStringField("content", "HTML content here");

		// Creating JSON Array within JSON Object
		generator.writeFieldName("tags");

		// Array of Tag objects
		generator.writeStartArray(); // Start with left bracket i.e. [

		// first tag object
		generator.writeStartObject(); // Start with left brace i.e. {
		generator.writeNumberField("id", 1);
		generator.writeStringField("name", "JSON");
		generator.writeEndObject(); // End with right brace i.e }

		// second tag object
		generator.writeStartObject(); // Start with left brace i.e. {
		generator.writeNumberField("id", 2);
		generator.writeStringField("name", "Java");
		generator.writeEndObject(); // End with right brace i.e }

		// second tag object
		generator.writeStartObject(); // Start with left brace i.e. {
		generator.writeNumberField("id", 3);
		generator.writeStringField("name", "Jackson");
		generator.writeEndObject(); // End with right brace i.e }

		generator.writeEndArray(); // End with right bracket i.e. ]

		generator.writeEndObject(); // End with right brace i.e }

		// Close JSON generator
		generator.close();
		// Print JSON Object
	}
}
