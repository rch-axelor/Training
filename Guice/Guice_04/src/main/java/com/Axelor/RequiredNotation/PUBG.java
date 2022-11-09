package com.Axelor.RequiredNotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import com.google.inject.BindingAnnotation;

@BindingAnnotation @Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER}) @Retention(RetentionPolicy.RUNTIME)
public @interface PUBG {

}
