package com.Axelor.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

import com.google.inject.RestrictedBindingSource;


@RestrictedBindingSource.Permit
@Retention(RetentionPolicy.RUNTIME)
@RestrictedBindingSource(explanation = "only Car moduleone can create the bindings.",permits= {GetCar.class})
public @interface CarsPermit {
}
	
