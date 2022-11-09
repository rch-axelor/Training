package com.Axelor.Request;

import com.Axelor.Guice_1.DrawShap;
import com.google.inject.Inject;

public class SqureRequest {
 DrawShap d;

 @Inject
public SqureRequest(DrawShap d) {
	this.d = d;
}
 
public void makeRequest()
{
	d.draw();
}
}
