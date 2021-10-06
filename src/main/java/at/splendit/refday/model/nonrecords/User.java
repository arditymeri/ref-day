package at.splendit.refday.model.nonrecords;

import java.util.Objects;

public class User {

	private String name;
	private String email;
	private Address address;

	public User(String name, String email, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, email, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name);
	}
	
	
}
