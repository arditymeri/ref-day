package at.splendit.refday.model.nonrecords;

import java.util.Objects;

public class Address {

	private String street;
	private String zip;
	private String city;
	private String country;

	public Address(String street, String zip, String city, String country) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public String getZip() {
		return zip;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + ", city=" + city + ", country=" + country + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, street, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(street, other.street) && Objects.equals(zip, other.zip);
	}
}
