package Fuctions;

public class user2 {

	public static void main(String[] args) 
	{
		car2 honda = new car2();
		honda.cc=2000;
		honda.Fueltype="diesel";
		honda.steering=1;
		honda.acceleration();
				
		car2 audi = new car2();
		audi.cc=3000;
		audi.Fueltype="diesel";
		audi.steering=1;
		audi.acceleration();
		
		car2 hyundai = new car2();
		hyundai.cc=1500;
		hyundai.Fueltype="petrol";
		hyundai.steering=1;
		hyundai.acceleration();
		//use constructor to initialize the instance variables
		
		

	}

}
