package ca.demo.salestool;

class SalesData{
	int SalesData[] = {0, 4, 10};
	
	public void display(){
		System.out.println("TODO: Implement data display");
		System.out.println("SAlesData : UPDATE FOR VERSION 2");
		
		
		for (int i=0; i < SalesData.length ; i++){
			System.out.println("Next value: "+SalesData[i]);
		}
	}
}