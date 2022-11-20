package com.Axelor.Givecolor;

import com.Axelor.Color.Color;
import com.Axelor.Color.Natural;
import com.Axelor.someextrainfo.EInfo;
import com.Axelor.someextrainfo.Extrainfo;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class GetColor {

	Extrainfo extrainfo = new EInfo();
	
	
	Provider<Color>red;
	Provider<Natural>rose;
	
	@Inject
	public GetColor(Provider<Color> red, Provider<Natural> rose) {
		super();
		this.red = red;
		this.rose = rose;
	}
	
	public void getinfo()
	{
		Color color = red.get();
		Natural natural = rose.get();
		
		color.name();
		natural.inNature();
		extrainfo.getEInfo();
	}
	
	/*lazy loding*/
	
	public void getoneinfo(int n)
	{
		if(n==1)
		{
			Color color = red.get();
			color.name();
		}
		else
		{
			Natural natural = rose.get();
			natural.inNature();
		}
	}
	
}
