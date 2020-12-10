package ood.backend.happytails.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SearchCity {

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String city;
	
	public SearchCity() {}

	public SearchCity(@NotNull(message = "is required") @Size(min = 1, message = "is required") String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
