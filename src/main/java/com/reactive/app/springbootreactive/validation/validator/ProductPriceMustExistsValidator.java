package com.reactive.app.springbootreactive.validation.validator;


import com.reactive.app.springbootreactive.validation.ProductPriceMustExists;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductPriceMustExistsValidator implements ConstraintValidator<ProductPriceMustExists, Integer>{

    @Override
    public void initialize(ProductPriceMustExists constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        if (value == null || value > 0){
            return true;
        }

        return true;
    }
}
