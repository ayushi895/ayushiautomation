package Fuctions;

public class FunctionOverloading {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sum(10, 20);
		sum(10,20,30);
		//method overloading is possible when we change the parameters

	}
	public static int sum(int a ,int b)
	{
		return a+b;
	}
	public static int sum(int a ,int b, int c)
	{
		return a+b+c;
	}

}
