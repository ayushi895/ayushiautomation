package conditionalStatements;

public class IfElseStatement {

	public static void main(String[] args)
	{
		/*if()
		 * {
		 * }else if()
		 * 
		 * {
		 * 
		 * }
		 */
		
		int a = 20;
		int b = 10;
		
		if(a>b)
		{
		    System.out.println("a>b");	
		}else if(a==b)
		{
			System.out.println("a==b");
		}else {
			System.out.println("a<b");
		}
		
	}

}
