package com.Axelor.demo2;

public class SquareRequest {        /*-----------<----Dependent----------------*/

	DrawShap d;                     /*-----------<----Dependency----------------*/
	
	public  SquareRequest(DrawShap d)
	{
		this.d=d;
	}
	
	public void makeRequest()
	{
		d.draw();
	}
}
