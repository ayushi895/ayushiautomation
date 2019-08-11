package Fuctions;

public class car {

	 
		static int wheels=4;
		String colour="Blue";
		String model;
		
		public void specification()
		{
			System.out.println("specifications: wheels:"+wheels+",colour="+colour+" and model-"+model);
		}

	    public static void testdrive()
	    {
	    	System.out.println("Test drive");
	    }
	    public static void main(String[] args)
	    {
	    	//static variables and static functions or class variables
			testdrive();//function calling has name
			System.out.println(wheels);
			//non static variables and non static functions or instance variables
			//create object to convert non static to static
			car c=new car();
			System.out.println(c.colour);
			c.specification();
			
		}

}
