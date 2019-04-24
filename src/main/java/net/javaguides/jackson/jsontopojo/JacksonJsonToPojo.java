package net.javaguides.jackson.jsontopojo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.javaguides.jackson.pojotojson.Post;
import net.javaguides.jackson.pojotojson.Tag;

/**
 * Convert JSON to Java object using Jackson
 * @author Ramesh Fadatare
 *
 */
public class JacksonJsonToPojo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		// Read JSON file and convert to java object
		InputStream fileInputStream = new FileInputStream("post.json");
		Post post = mapper.readValue(fileInputStream, Post.class);
		fileInputStream.close();
		
		// print post object
		System.out.println("Printing post details");
		System.out.println(post.getId());
		System.out.println(post.getTitle());
		System.out.println(post.getDescription());
		System.out.println(post.getContent());
		System.out.println(post.getLastUpdatedAt());
		System.out.println(post.getPostedAt());
		
		// print tags of this post
		System.out.println("Printing tag details of post :: " + post.getTitle());
		for (Iterator<Tag> iterator = post.getTags().iterator(); iterator.hasNext();) {
			Tag tag = (Tag) iterator.next();
			
			System.out.println(tag.getId());
			System.out.println(tag.getName());
			
		}
	}
}
