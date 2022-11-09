package com.Axelor.Deom;

import com.Axelor.Guice_1.DrawShap;
import com.Axelor.Guice_1.DrawSqure;
import com.Axelor.Module.AppModule;
import com.Axelor.Request.SqureRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

    private static final String squre_req = "Squre";
    
    private static void sendrequest(String request)
    {
    	if(request.equalsIgnoreCase(squre_req))
    	{
    	//	DrawShap d = new DrawSqure();
     		Injector injector =Guice.createInjector(new AppModule() );   //initializing the injector 
    		DrawSqure d = injector.getInstance(DrawSqure.class);
            SqureRequest sr = new SqureRequest(d);
    		/*-------------Elementin the object creation here allso--------------*/
    //		SqureRequest sr= injector.getInstance(SqureRequest.class);   
    		sr.makeRequest();
    	}
    }
    
    
	public static void main(String[] args) {
              
		sendrequest(squre_req);
	}

}
