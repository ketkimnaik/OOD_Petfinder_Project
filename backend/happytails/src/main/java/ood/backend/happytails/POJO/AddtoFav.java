package ood.backend.happytails.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="add_to_fav")
public class AddtoFav {

//	Link all the columns present in database table with the backend
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="dogid")
	int dogId;
	
	@Column(name="userid")
	int userId;
	
	public AddtoFav() {}

//	Define fieldwise constructor
	public AddtoFav(int dogId, int userId) {
		this.dogId = dogId;
		this.userId = userId;
	}

//	Define Getter and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDogId() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	
}
