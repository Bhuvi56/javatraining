package com.training;

public class ObjectFacory {
	
	public  Automobile getObject(int key) {
		Automobile obj = null;
		switch (key) {
		case 1:
			obj=new MarutiCar();
			break;
			
		case 2:
			obj = new ToyataCar();break;
		default:
			
			break;
		}
		return obj;
		

}

	public void PrintQuot(Automobile poly) {

		System.out.println(poly.toString());
	}
}
