package conditionalStatements;

public class NestedIfStatements {

	public static void main(String[] args) 
	{
		int a=40;
		int b=20;
		int c=30;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a>c");
			}else {
				System.out.println("a>b<c");
			}
		}else {
			System.out.println("a<b");
			
		}
	}

}
