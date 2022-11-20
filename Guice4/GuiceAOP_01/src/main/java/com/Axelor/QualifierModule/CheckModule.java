package com.Axelor.QualifierModule;

import javax.inject.Qualifier;

import com.Axelor.Checking.Check;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class CheckModule extends AbstractModule{

	@Override
	protected void configure() {
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(Qualifier.class), new Check());
	}
}
