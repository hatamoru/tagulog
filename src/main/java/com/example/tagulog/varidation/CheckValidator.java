package com.example.tagulog.varidation;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CheckValidator implements ConstraintValidator<CheckBody,String> {

    @Autowired
    public CheckBody checkBody;

    @Override
    public void initialize(CheckBody constraintAnnotation) {
    }

    @Override
    public boolean isValid(String text,  ConstraintValidatorContext context) {

        return text.isEmpty();
    }
}
