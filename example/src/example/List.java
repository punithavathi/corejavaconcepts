package example;

import java.util.Iterator;
import java.util.LinkedList;



public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Chennai");
		ll.add("tindivanam");
		ll.add("pondy");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
