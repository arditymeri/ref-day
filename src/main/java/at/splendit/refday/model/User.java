package at.splendit.refday.model;

import java.util.Objects;

public record User(String name, String email, Address address) implements Person {

	/*
	 * Compact constructor. 
	 */
	public User {
		Objects.requireNonNull(email);
	}

	/*
	 * It is possible to define a custom constructor, but it needs to call the
	 * canonical constructor.
	 */
	public User(String email) {
		this("", email, new Address("", "", "", ""));
	}

	/*
	 * It is possible to define methods.
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * It is possible to override a getter.
	 */
	@Override
	public Address address() {
		return this.address;
	}

}
