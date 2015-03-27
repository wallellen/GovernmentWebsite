package com.gws.zy.model;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProductAddValidator implements Validator {

	public boolean supports(Class clazz) {
		return clazz.equals(Product.class);
	}

	public void validate(Object obj, Errors errors) {
		Product p = (Product) obj;
		if (p == null) {
			errors.rejectValue("percentage", "error.description-not-specified", 
					null,"Value required.");
		} else {
			if (p.getDescription() == null ) {
				errors.rejectValue( "description", "error.description-not-specified" );
			}
			if (p.getPrice() == null ) {
				errors.rejectValue( "price", "error.price-not-specified",
                    null, "Value required." );
			} else if (p.getPrice().floatValue() <= 0) {
				errors.rejectValue("price", "error.too-low",
						new Object[] { p.getPrice() },
						"Value too low.");
			}
		}
	}
	
}
