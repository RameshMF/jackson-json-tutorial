package net.javaguides.jackson.pojotojson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Convert Java to Json using Jackson API
 * @author Ramesh Fadatare
 *
 */
public class JacksonPojoToJson {
	public static void main(String[] args) throws IOException {
		 // Create ObjectMapper
	      ObjectMapper mapper = new ObjectMapper();
	      mapper.enable(SerializationFeature.INDENT_OUTPUT);
	      
	      // create a post
	      Post post = new Post();
	      post.setTitle("Jackson JSON API Guide");
	      post.setId(100L);
	      post.setDescription("Post about Jackson JSON API");
	      post.setContent("HTML content here");
	      post.setLastUpdatedAt(new Date());
	      post.setPostedAt(new Date());
	      
	      // create some predefined tags
	      Set<Tag> tags = new HashSet<>();
	      Tag java = new Tag(1L, "Java");
	      Tag jackson = new Tag(2L, "Jackson");
	      Tag json = new Tag(3L, "JSON");
	      tags.add(java);
	      tags.add(jackson);
	      tags.add(json);
	      
	      // set tags to post
	      post.setTags(tags);
	      
	   // Convert object to JSON string
	      String postJson = mapper.writeValueAsString(post);
	      System.out.println(postJson);
	      
	      // Save JSON string to file
	      FileOutputStream fileOutputStream = new FileOutputStream("post.json");
	      mapper.writeValue(fileOutputStream, post);
	      fileOutputStream.close();
	}
}
