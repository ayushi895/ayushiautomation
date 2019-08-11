package StringClass;

import java.util.Scanner;

public class CountofCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		System.out.println("enter string for counting charecters of each word");
		String str=read.nextLine();
		count(str);
		
		

	}

	private static void count(String str) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String a="";
			while(i<ch.length && ch[i]!=' ')
			{
				a=a+ch[i];
				i++;
			}
			if(a.length()>0)
			{
				System.out.println(a="-->"+a.length());
			}
		}
	}

}
