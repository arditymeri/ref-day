package at.splendit.refday.model;

import java.util.Objects;

public record Address(String street, String zip, String city, String country) {
	
	/*
	 * Compact constructor
	 */
	public Address {
		Objects.requireNonNull(street);
	}

}
