package ood.backend.happytails.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dogdata")
public class DogData {

//	Define all columns present in dogdata table
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "org_id")
	private String org_id;
	
	@Column(name = "pic_new")
	private String pic_new;
	
	@Column(name = "species")
	private String species;
	
	@Column(name = "breed_primary")
	private String breed_primary;
	
	@Column(name = "breed_secondary")
	private String breed_secondary;
	
	@Column(name = "breed_mixed")
	private String breed_mixed;
	
	@Column(name = "breed_unknown")
	private String breed_unknown;
	
	@Column(name = "color_primary")
	private String color_primary;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "house_trained")
	private String house_trained;
	
	@Column(name = "special_needs")
	private String special_needs;
	
	@Column(name = "shots_current")
	private String shots_current;
	
	@Column(name = "env_children")
	private String env_children;
	
	@Column(name = "env_dogs")
	private String env_dogs;
	
	@Column(name = "env_cats")
	private String env_cats;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "tags")
	private String tags;
	
	@Column(name = "status")
	private String status;
	
	
	@Column(name = "posted")
	private String posted;
	
	@Column(name = "contact_city")
	private String contact_city;
	
	@Column(name = "contact_state")
	private String contact_state;
	
	@Column(name = "contact_zip")
	private int zipcode;
	
	@Column(name = "contact_country")
	private String contact_country;
	
	@Column(name = "stateQ")
	private String state_Q;
	
	@Column(name = "accessed")
	private String accessed;
	
	@Column(name = "type")
	private String dogtype;
	
	@Column(name = "description")
	private String description;
	
	public DogData() {}

//	Define fieldwise constructor
	public DogData(int id, String org_id, String pic_new, String species, String breed_primary, String breed_secondary,
			String breed_mixed, String breed_unknown, String color_primary, String age, String sex, String size,
			String house_trained, String special_needs, String shots_current, String env_children, String env_dogs,
			String env_cats, String name, String tags, String status, String contact_city, String posted,
			String contact_state, int zipcode, String contact_country, String state_Q, String accessed, String dogtype,
			String description) {
		this.id = id;
		this.org_id = org_id;
		this.pic_new = pic_new;
		this.species = species;
		this.breed_primary = breed_primary;
		this.breed_secondary = breed_secondary;
		this.breed_mixed = breed_mixed;
		this.breed_unknown = breed_unknown;
		this.color_primary = color_primary;
		this.age = age;
		this.sex = sex;
		this.size = size;
		this.house_trained = house_trained;
		this.special_needs = special_needs;
		this.shots_current = shots_current;
		this.env_children = env_children;
		this.env_dogs = env_dogs;
		this.env_cats = env_cats;
		this.name = name;
		this.tags = tags;
		this.status = status;
		this.contact_city = contact_city;
		this.posted = posted;
		this.contact_state = contact_state;
		this.zipcode = zipcode;
		this.contact_country = contact_country;
		this.state_Q = state_Q;
		this.accessed = accessed;
		this.dogtype = dogtype;
		this.description = description;
	}

//	Define Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrg_id() {
		return org_id;
	}

	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}

	public String getPic_new() {
		return pic_new;
	}

	public void setPic_new(String pic_new) {
		this.pic_new = pic_new;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed_primary() {
		return breed_primary;
	}

	public void setBreed_primary(String breed_primary) {
		this.breed_primary = breed_primary;
	}

	public String getBreed_secondary() {
		return breed_secondary;
	}

	public void setBreed_secondary(String breed_secondary) {
		this.breed_secondary = breed_secondary;
	}

	public String getBreed_mixed() {
		return breed_mixed;
	}

	public void setBreed_mixed(String breed_mixed) {
		this.breed_mixed = breed_mixed;
	}

	public String getBreed_unknown() {
		return breed_unknown;
	}

	public void setBreed_unknown(String breed_unknown) {
		this.breed_unknown = breed_unknown;
	}

	public String getColor_primary() {
		return color_primary;
	}

	public void setColor_primary(String color_primary) {
		this.color_primary = color_primary;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getHouse_trained() {
		return house_trained;
	}

	public void setHouse_trained(String house_trained) {
		this.house_trained = house_trained;
	}

	public String getSpecial_needs() {
		return special_needs;
	}

	public void setSpecial_needs(String special_needs) {
		this.special_needs = special_needs;
	}

	public String getShots_current() {
		return shots_current;
	}

	public void setShots_current(String shots_current) {
		this.shots_current = shots_current;
	}

	public String getEnv_children() {
		return env_children;
	}

	public void setEnv_children(String env_children) {
		this.env_children = env_children;
	}

	public String getEnv_dogs() {
		return env_dogs;
	}

	public void setEnv_dogs(String env_dogs) {
		this.env_dogs = env_dogs;
	}

	public String getEnv_cats() {
		return env_cats;
	}

	public void setEnv_cats(String env_cats) {
		this.env_cats = env_cats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContact_city() {
		return contact_city;
	}

	public void setContact_city(String contact_city) {
		this.contact_city = contact_city;
	}

	public String getPosted() {
		return posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}

	public String getContact_state() {
		return contact_state;
	}

	public void setContact_state(String contact_state) {
		this.contact_state = contact_state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getContact_country() {
		return contact_country;
	}

	public void setContact_country(String contact_country) {
		this.contact_country = contact_country;
	}

	public String getState_Q() {
		return state_Q;
	}

	public void setState_Q(String state_Q) {
		this.state_Q = state_Q;
	}

	public String getAccessed() {
		return accessed;
	}

	public void setAccessed(String accessed) {
		this.accessed = accessed;
	}

	public String getDogtype() {
		return dogtype;
	}

	public void setDogtype(String dogtype) {
		this.dogtype = dogtype;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Dog_Data [id=" + id + ", org_id=" + org_id + ", pic_new=" + pic_new + ", species=" + species
				+ ", breed_primary=" + breed_primary + ", breed_secondary=" + breed_secondary + ", breed_mixed="
				+ breed_mixed + ", breed_unknown=" + breed_unknown + ", color_primary=" + color_primary + ", age=" + age
				+ ", sex=" + sex + ", size=" + size + ", house_trained=" + house_trained + ", special_needs="
				+ special_needs + ", shots_current=" + shots_current + ", env_children=" + env_children + ", env_dogs="
				+ env_dogs + ", env_cats=" + env_cats + ", name=" + name + ", tags=" + tags + ", status=" + status
				+ ", contact_city=" + contact_city + ", posted=" + posted + ", contact_state=" + contact_state
				+ ", zipcode=" + zipcode + ", contact_country=" + contact_country + ", state_Q=" + state_Q
				+ ", accessed=" + accessed + ", dogtype=" + dogtype + ", description=" + description + "]";
	}

	
	
}
