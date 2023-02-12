package com.murtazin.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail, String> {


    public String enfOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        enfOfEmail=checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(enfOfEmail);
    }
}
