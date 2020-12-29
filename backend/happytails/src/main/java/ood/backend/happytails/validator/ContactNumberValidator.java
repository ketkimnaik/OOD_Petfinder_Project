package ood.backend.happytails.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {
	@Override
    public void initialize(ContactNumberConstraint contactNumber) {
    }
 
    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
      
        return contactField != null && contactField.matches("^(\\+\\d{1,2}\\s?)?1?\\-?\\.?\\s?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$")
        		&& (contactField.length() > 8) && (contactField.length() < 20);
    }
}
