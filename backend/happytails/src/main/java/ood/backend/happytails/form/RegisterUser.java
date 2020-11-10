package ood.backend.happytails.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ood.backend.happytails.validator.ContactNumberConstraint;
import ood.backend.happytails.validator.FieldMatch;
import ood.backend.happytails.validator.ValidEmail;

@FieldMatch.List({
    @FieldMatch(first = "password", second = "matchingPassword", message = "The password fields must match")
})
public class RegisterUser {
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

	@ValidEmail
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String email;
	
	@ContactNumberConstraint
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String phone;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String password;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String matchingPassword;

	public RegisterUser() {}

	public RegisterUser(@NotNull(message = "is required") @Size(min = 1, message = "is required") String firstName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String email,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String phone,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String password,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String matchingPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.matchingPassword = matchingPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}
	
	
}
