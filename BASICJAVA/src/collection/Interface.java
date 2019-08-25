package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Interface {

	public static void main(String[] args) 
	{
		//Hashset
		/*
		 * Set<Integer> set=new HashSet<>(); set.add(10); set.add(20); set.add(30);
		 * set.add(40); set.add(30); set.add(40); for(int a:set) {
		 * System.out.println(a); }
		 */
		//LinkedHashset-Insertion order preserved
		/*
		 * Set<Integer> set=new LinkedHashSet<>(); set.add(10); set.add(20);
		 * set.add(30); set.add(40); set.add(30); set.add(40); for(int a:set) {
		 * System.out.println(a); }
		 */
		//TREESET-sorted(serial wise data)
		
		  Set<Integer> set=new TreeSet<>(); set.add(30); set.add(40); set.add(30);
		  set.add(40); set.add(10); set.add(20); for(int a:set) {
		  System.out.println(a); }
		 
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
