package Oops.Inheritence;

public class user {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SmartPhone sm= new SmartPhone();
		sm.Internet();
		sm.calling();
		sm.texting();

		
		Mobile mb=new Mobile();
		mb.texting();
		mb.calling();
		
		Telephone phones=new Telephone();
		phones.calling();
		
		

	}

}
