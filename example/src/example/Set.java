package example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> tr=new HashSet<String>();

		tr.add("science");
		tr.add("maths"); 
		tr.add("tamil");
		Iterator<String> itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
