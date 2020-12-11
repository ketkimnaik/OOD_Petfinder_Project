package ood.backend.happytails.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dogdaycare")
public class DogCare {

//	Define all columns present in dogdaycare center table
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name = "name")
	public String name;
	
	@Column(name = "street_number")
	public String streetNumber;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "zipcode")
	private String zipcode;
	
	@Column(name = "state")
	public String state;
	
	@Column(name = "country")
	public String country;
	
	@Column(name = "contact_number")
	public String phone;
	
	public DogCare() {}

//	Fieldwise constructor
	public DogCare(String name, String streetNumber, String city, String zipcode, String state, String country,
			String phone) {
		this.name = name;
		this.streetNumber = streetNumber;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
		this.phone = phone;
	}

//	Getter and setters for all fields
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

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "DogCare [id=" + id + ", name=" + name + ", streetNumber=" + streetNumber + ", city=" + city
				+ ", zipcode=" + zipcode + ", state=" + state + ", country=" + country + ", phone=" + phone + "]";
	}
	
	
	
}
