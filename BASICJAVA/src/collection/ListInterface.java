package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) 
	{
		//ARRAY LIST
		//List<String>-generic list=new ArrayList<>();
		/*
		 * List<String> list =new ArrayList<>(); list.add("Anand"); list.add("Bhayre");
		 * list.add("Tech Bodhi");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		//LINKEDLIST
		/*
		 * List<String> list =new LinkedList<>(); list.add("Anand"); list.add("Bhayre");
		 * list.add("Tech Bodhi");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		//VECTOR
		List<String> list =new Vector<>();
		list.add("Anand");
		list.add("Bhayre");
		list.add("Tech Bodhi");
		list.add("Bhayre");
		list.add("Tech Bodhi");
		
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
