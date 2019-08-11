package Fuctions;

public class user {

	public static void main(String[] args) 
	{
		System.out.println(car.wheels);
		car.testdrive();
		car.wheels=5;
		//non static functions and variables
		car Renault = new car();
		Renault.colour="Black";
		Renault.model="KWID";
		Renault.specification();
		
		car BMW = new car();
		//BMW.colour="White";
		//BMW.model="X1";
		BMW.specification();
		
		car Jaguar = new car();
		//Jaguar.colour="Wine";
		//Jaguar.model="XJ";
		Jaguar.specification();
		
		Renault.specification();

	}

}
