package com.cool2code.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidationAnnotationConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidationAnnotation {
    // define default course code
    public String value() default "course";
    // define default error message
    public String message() default "must start with course";
    // define default groups
    public Class<?>[] groups() default {};
    // define default payloads
    public Class<? extends Payload>[] payload() default {};
}
