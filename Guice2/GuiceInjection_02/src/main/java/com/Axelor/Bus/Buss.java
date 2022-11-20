package com.Axelor.Bus;

import com.google.inject.ImplementedBy;

@ImplementedBy(BusOne.class)
public interface Buss {

	public void busName();
}
