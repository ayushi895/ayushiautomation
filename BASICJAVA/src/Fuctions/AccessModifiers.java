package Fuctions;

public class AccessModifiers {

	public static void main(String[] args) 
	{
		//public,private,protected,Default/no access modifier
		//public is accessible throughout project
		//private-within class
		//protected-within package and outside the package by using child class
		//Default/no access modifier-within package
		{
			AccessModifiers  obj=new AccessModifiers();
			obj.publicfunction();
			obj.privatefunction();
			obj.protectedfunction();
			obj.defaultfunction();
			 
		}

	}
	private void privatefunction() {
		// TODO Auto-generated method stub
		
	}
	public void publicfunction()
	{
		System.out.println("public function");
	}
	protected void protectedfunction()
	{
		System.out.println("protected function");
	}
	void defaultfunction()
	{
		System.out.println("default function");
	}

}
