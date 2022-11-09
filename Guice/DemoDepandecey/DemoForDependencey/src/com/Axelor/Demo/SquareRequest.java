package com.Axelor.Demo;

public class SquareRequest  {              /*-----------<----Dependent----------------*/

DrawSqure drawSqure = new DrawSqure();    /*-----------<----Dependency----------------*/

   public void makeRequest()
   {
	   drawSqure.draw();
   }
}
