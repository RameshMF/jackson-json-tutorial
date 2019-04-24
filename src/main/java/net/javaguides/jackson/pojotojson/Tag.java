package net.javaguides.jackson.pojotojson;

public class Tag {
    private Long id;
    private String name;

    public Tag() {

    }

    public Tag(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Tag(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
