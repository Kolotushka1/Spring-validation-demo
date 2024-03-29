package com.cool2code.springdemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidationAnnotationConstraintValidator implements ConstraintValidator<ValidationAnnotation, String> {

    private String coursePrefix;

    @Override
    public void initialize(ValidationAnnotation theValidationAnnotation) {
        coursePrefix = theValidationAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result;

        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        } else {
            result = true;
        }

        return result;
    }
}
