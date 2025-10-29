package PaqueteAuthor;

public class Author {

	private String name;
	private String email;
	private char gender;

	// Constructor
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	// Getter para name
	public String getName() {
		return this.name;
	}

	// Getter para email
	public String getEmail() {
		return this.email;
	}

	// Setter para email
	public void setEmail(String email) {
		this.email = email;
	}

	// Getter para gender
	public char getGender() {
		return this.gender;
	}

	// toString con formato especificado
	@Override
	public String toString() {
		return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}