package net.javaguides.jackson.ignore;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CustomerDTO {
	
	@JsonIgnore
	private final String id;
	
	@JsonIgnore
	private final String firstName;
	private final String lastName;

    public CustomerDTO(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
