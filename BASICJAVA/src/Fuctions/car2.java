package Fuctions;

public class car2 
{
	int cc;
	String Fueltype;
	int steering;
	
	public car2()// default constructor
	{
		
	}
	
	public car2(int cc, String fueltype,int steering)//parameterized constructor
	{
		this.cc=cc;//we use this to locate local variables in constructor
		this.Fueltype = fueltype;
		this.steering = steering;
		
	}
	public void acceleration() 
	{
		System.out.println("car is accelerating with: Engine:"+cc+",Fueltype="+Fueltype+" and steering="+steering);
		System.out.println(steering+"steering car's fueltype is" + Fueltype+ " and engine size is "+cc);
	}

}