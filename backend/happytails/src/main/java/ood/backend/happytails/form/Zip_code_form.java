package ood.backend.happytails.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Zip_code_form {

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String zipcode;

	public Zip_code_form(@NotNull(message = "is required") @Size(min = 1, message = "is required") String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
