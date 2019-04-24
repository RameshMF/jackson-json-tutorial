package net.javaguides.jackson.ignore;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class UserDTO {

	public int id;
	public Name name;

	
	public UserDTO(int id, Name name) {
		super();
		this.id = id;
		this.name = name;
	}

	@JsonIgnoreType
	public static class Name {
		public String firstName;
		public String lastName;
		public Name(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}

}
