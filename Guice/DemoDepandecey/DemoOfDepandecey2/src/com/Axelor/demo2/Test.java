package com.Axelor.demo2;

public class Test {

	public static void main(String[] args) {
	
		DrawShap drawShap = new DrawSqure();
		SquareRequest request = new SquareRequest(drawShap);
		request.makeRequest();
		
		
		DrawShap drawShap1 = new DrawBigSquare();
		new SquareRequest(drawShap1).makeRequest();

	}

}
