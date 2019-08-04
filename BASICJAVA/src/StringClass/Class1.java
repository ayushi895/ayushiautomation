package StringClass;

public class Class1 {

	public static void main(String[] args) 
	{
		String name="Ayushi";
		String name2="ayushi";
		//1.charAt
		System.out.println(name.charAt(5));
		//2.TopUpperXase
		System.out.println(name.toUpperCase());
		//3.ToLowerCase
		System.out.println(name.toLowerCase());
		//4.Equal//for string
		System.out.println(name.equals(name2));
		//5.EqualIgnoreCase
		System.out.println(name.equalsIgnoreCase(name2));
		//6.Split
		String str="U1,U2,U3";
		String[] users=str.split(",");
	    //System.out.println(str);
			for(int i=0;i<users.length;i++)
			{
				System.out.println(users[i]);
		}
	    //7.Replace
		System.out.println(str.replace(",", "|"));
		//8.SubString
		System.out.println(name.substring(2));//with begin index only,from which index u want value
		System.out.println(name.substring(0, 5));//with bothindex but not that end index doesn't get count
        //9. Contains
		System.out.println(name.contains("yush"));
	}

}
